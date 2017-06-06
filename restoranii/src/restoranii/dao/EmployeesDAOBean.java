package restoranii.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.Query;

import restoranii.model.Employee;

@Stateless
@Local(EmployeesDAO.class)
public class EmployeesDAOBean extends GenericDaoBean<Employee, Integer> implements EmployeesDAO{

	@SuppressWarnings("unchecked")
	public Employee login(String email, String password) {
		Query q = em.createQuery(
				"SELECT e FROM Employee e WHERE e.username=:username AND e.password=:password");
		q.setParameter("username", email);
	    q.setParameter("password", password);
	    List<Employee> list = q.getResultList();
	    if (list.size() == 0)
	      return null;
	    else
	      return list.get(0);
	}

}