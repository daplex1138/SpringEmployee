package beans;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void payRaise(long employeeId, double amount) {
		Employee employee = employeeDao.find(employeeId);
		
		employee.setPayRate(employee.getPayRate() + amount);
		employeeDao.update(employee);
	}

	public Employee getEmployee(long employeeId) {
		return employeeDao.find(employeeId);
	}

}
