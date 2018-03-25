package beans;

import java.util.List;

public interface EmployeeDao {
	
	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee> employees);
	public void delete(long id);
	public Employee find(long id);
	public List<Employee> find(List<Long> ids);
	public List<Employee> find(String name);

}
