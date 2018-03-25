package beans;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeDaoInMemoryImpl implements EmployeeDao{
	
	private Map<Long, Employee> employeeMap = new HashMap<Long, Employee>();
	{
		Employee employee1 = new Employee(1L, "Patrick", 23.00);
		Employee employee2 = new Employee(2L, "Hank", 35.00);
		
		employeeMap.put(employee1.getId(), employee1);
		employeeMap.put(employee2.getId(), employee2);
	}

	public void insert(Employee employee) {
		employeeMap.put(employee.getId(), employee);
	}

	public void update(Employee employee) {
		employeeMap.put(employee.getId(), employee);
	}

	public void update(List<Employee> employees) {
		for(Employee employee: employees) {
			update(employee);
		}
	}

	public void delete(long id) {
		employeeMap.remove(id);
	}

	public Employee find(long id) {
		return employeeMap.get(id);
	}

	public List<Employee> find(List<Long> ids) {
		List<Employee> employees = new ArrayList<Employee>();
		for(Long id: ids) {
			employees.add(employeeMap.get(id));
		}
		return employees;
	}

	public List<Employee> find(String name) {
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeeMap.values()) {
			if(name.equals(employee.getName())) {
				employees.add(employee);
			}
		}
		return employees;
	}

}
