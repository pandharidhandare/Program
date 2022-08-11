package org.mycompany.service;
import  org.mycmpany.model.Employee;
public class EmployeeService {
      
	public  int calculateSalaryUp(Employee Obj1) {
	
	int salaryUp =	Obj1.getEmployeeSalary() +(Obj1.getEmployeeSalary()*25)/100;{
	return  salaryUp ;  
	}
	}
}
