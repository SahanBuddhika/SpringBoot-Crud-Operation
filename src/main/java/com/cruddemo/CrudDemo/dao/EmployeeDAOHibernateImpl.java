package com.cruddemo.CrudDemo.dao;	    

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.cruddemo.CrudDemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	 //define fields for entitymanager
	private EntityManager entityManager;
	
	@Override 
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;  
	}
}
