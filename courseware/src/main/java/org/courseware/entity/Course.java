package org.courseware.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="course")
public class Course {
@Id
@GeneratedValue
@Column(name="course_id")
private int courseid;
@Column(name="course_name")
private String coursename;
@Column(name="course_price")
private double courseprice;
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy ="studentid")
@Column(name="student")
private List<Student> student;
public Course(String coursename, double courseprice) {
	super();
	this.coursename = coursename;
	this.courseprice = courseprice;
}
}
