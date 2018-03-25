package beans;

import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		double payrate1 = employeeService.getEmployee(1).getPayRate();
		double payrate2 = employeeService.getEmployee(2).getPayRate();
				
		
		System.out.print("Employee 1 payrate: ");
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payrate1));
		employeeService.payRaise(1, 12.00);
		System.out.print("Employee 1 increased payrate: ");
		payrate1 = employeeService.getEmployee(1).getPayRate();
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payrate1));
		
		System.out.print("Employee 2 payrate: ");
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payrate2));
		employeeService.payRaise(2, 1.01);
		System.out.print("Employee 2 increased payrate: ");
		payrate2 = employeeService.getEmployee(2).getPayRate();
		System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payrate2));
		
		applicationContext.close();
	}

}
