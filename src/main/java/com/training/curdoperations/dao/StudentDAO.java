package com.training.curdoperations.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.curdoperations.entities.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer> {
	
	
	
	public List<Student> findStudentsByMarks(float marks);
	
	@Query("select s.marks from Student s")
	public Collection<Float> createCustomQuery();
	
	@Query("select s.marks from Student s where s.name=:name")
	public Collection<Float> createCustomQueryNyname(@Param("name") String name);
	
	@Query("select s from Student s where s.name=:name")
	public Collection<Student> createCustomQueryForStudent(@Param("name") String name);
	
	@Query(value="select * from Student where name is  null",nativeQuery=true)
	public Collection<Student> createCustomQueryForStudentNativeQuery(@Param("name") String name);

}
