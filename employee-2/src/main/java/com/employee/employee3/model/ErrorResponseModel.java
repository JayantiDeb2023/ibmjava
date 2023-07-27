package com.employee.employee3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ErrorResponseModel {
private long errorReportingTime;
private String errorMessage;
private int errorCode;

}
