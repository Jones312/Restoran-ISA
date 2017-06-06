package restoranii.dao;

import restoranii.model.Employee;

public interface EmployeesDAO extends GenericDao<Employee, Integer> {
	public Employee login(String email, String password);
}
