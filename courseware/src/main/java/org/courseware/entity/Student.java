package org.courseware.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name="student")
public class Student {
@Id
@GeneratedValue
@Column(name="student_id")
private int studentid;
@Column(name="student_name")
private String name;
@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
private Course course;
public Student(String name, Course course) {
	super();
	this.name = name;
	this.course = course;
}
}
