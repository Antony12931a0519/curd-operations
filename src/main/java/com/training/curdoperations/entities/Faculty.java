package com.training.curdoperations.entities;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
@SqlResultSetMapping(
name = "mapppinNativeQuery1",  // same as resultSetMapping above in NativeQuery
   classes = {
      @ConstructorResult( 
          targetClass = com.training.curdoperations.entities.Faculty.class,
          columns = {
               @ColumnResult( name = "ID", type = Integer.class),
               @ColumnResult( name = "NAME", type = String.class)
              
               
          }
      )
   }  
)

@Entity
@Table(name = "FACULTY")
public class Faculty {
@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}

	//order of columns should mach with constructor
	public Faculty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public Faculty() {
		super();
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	


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

}
