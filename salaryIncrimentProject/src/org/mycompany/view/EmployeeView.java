package org.mycompany.view;
import  org.mycmpany.model.Employee;
import org.mycompany.service.EmployeeService;
public class EmployeeView {
 


	public static void main (String[] args) {
	Employee employee1 =new Employee(1, 20000,'a');
//	EmployeeService employeeSer1 =new EmployeeService();
	EmployeeService employeeSer1 =new EmployeeService();
	int  UpdatedSalary= employeeSer1.calculateSalaryUp(employee1);
	System.out.println("Old Salary" +   employee1. getEmployeeSalary());
	System.out.println("UpdatedSalary"+UpdatedSalary);
	 
	//Employee UpdateEmployee = Employee.getEmployeeSalary(Employee1);
	
	  
	 System.out.println("EmployeeIitial"+  employee1.getEmployeeInitial());
	System.out.println("employeeId"+ employee1.getEmployeeId());
	
	}
	
}
