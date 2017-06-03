package Restorani.dao;

import Restorani.Model.Employee;


public interface EmployeesDAO extends GenericDao<Employee, Integer> {
	public Employee login(String email, String password);
}

	