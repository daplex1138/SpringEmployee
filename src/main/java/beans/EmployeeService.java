package beans;

public interface EmployeeService {
	public void payRaise(long employeeId, double amount);
	public Employee getEmployee(long employeeId);

}
