package com.employee.employee3.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee3.exception.EmployeeNotFoundException;
import com.employee.employee3.model.Customer;
import com.employee.employee3.model.Employee;
import com.employee.employee3.model.ErrorResponseModel;
import com.employee.employee3.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handleError(EmployeeNotFoundException e)
	{
		ErrorResponseModel model=new ErrorResponseModel();
		model.setErrorMessage(e.getMessage());
		model.setErrorCode(HttpStatus.NOT_FOUND.value());
		model.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(model);
	}

	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployees()
	{
		return ResponseEntity.ok(employeeService.listEmployees());
	}
	@GetMapping("/{employeeId}")
	public ResponseEntity<?> findEmployeeById(@PathVariable int employeeId)
	{
		Optional<Employee> optional=employeeService.getEmployeeById(employeeId);
		
		if(optional.isEmpty())
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("employee with "+employeeId+" not found");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.FOUND).body(optional.get());
		}
	}
	@PutMapping("/{customerId}")
	public ResponseEntity<?> updateCustomerById(@PathVariable int customerId,
			@RequestBody Employee customer)

	{
		Employee tempCustomer =  employeeService.updateCustomerById(customerId, customer);
		if (tempCustomer == null) {
			return new ResponseEntity<String>("customer with " + customerId + " not found ", HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Employee>(tempCustomer, HttpStatus.OK);
		}

	}

	@DeleteMapping("/{customerId}")
	public ResponseEntity<?> deleteBycustomerId(@PathVariable int customerId) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.deleteCustomerById(customerId));
	}
	@GetMapping("/find/{firstName}")
	public ResponseEntity<?> findByFirstName(@PathVariable("firstName") String firstName)
	{
		List<Employee> employees=employeeService.findByFirstName(firstName);
		if(employees==null)
		{
			throw new EmployeeNotFoundException("employee with "+firstName+" not found");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		}
	}
   @GetMapping("/find/{firstName}/{lastName}")
   public  ResponseEntity<?> findByFirstNameOrLastName(@PathVariable String firstName,@PathVariable String lastName)
   {
	   List<Employee> employees=employeeService.findByFirstNameOrLastName(firstName,lastName);
	   if(employees==null)
		{
			throw new EmployeeNotFoundException("employee with "+firstName+" not found");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		}
   }
   @GetMapping("/find/{firstName}/{lastName}")
   public  ResponseEntity<?> findByFirstNameAndLastName(@PathVariable String  firstName,@PathVariable String lastName)
   {
	   List<Employee> employees=employeeService.findByFirstNameOrLastName(firstName,lastName);
	   if(employees==null)
		{
			throw new EmployeeNotFoundException("employee with "+firstName+" not found");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.OK).body(employees);
		}
   }
}