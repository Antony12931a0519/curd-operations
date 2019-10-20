package com.training.curdoperations.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.training.curdoperations.entities.Student;

@Repository
public class CustomStudentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Student> findSudentDetails() {

		Query query = entityManager.createNativeQuery("select id,initial,marks,name from student","mapppinNativeQuery");
		return query.getResultList();

	}

}
