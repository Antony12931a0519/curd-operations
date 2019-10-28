package com.training.curdoperations.entities;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
@SqlResultSetMapping(
name = "mapppinNativeQuery",  // same as resultSetMapping above in NativeQuery
   classes = {
      @ConstructorResult( 
          targetClass = com.training.curdoperations.entities.Student.class,
          columns = {
               @ColumnResult( name = "ID", type = Integer.class),
               @ColumnResult( name = "NAME", type = String.class),
               @ColumnResult( name = "INITIAL", type = String.class),
               @ColumnResult( name = "MARKS", type = Double.class)
               
          }
      )
   }  
)

@Entity
@Table(name = "STUDENT")
public class Student {

	public Student(int id, String name, String initial, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.initial = initial;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", initial=" + initial
				+ ", marks=" + marks + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String initial;
	private double marks;

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
