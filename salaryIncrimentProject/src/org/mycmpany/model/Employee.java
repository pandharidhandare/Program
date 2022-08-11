package org.mycmpany.model;

public class Employee {

	private int empoyeeId; 
	private int employeeSalary;
    private	char employeeInitial;
	
	public  Employee(int id ,int salary,char initial) {
		empoyeeId = id;
		employeeSalary=salary;
		employeeInitial= initial;
		
		   
	}
	public void Employeed() {
	}
	
    public void setEmployeedId(int id) {
    	empoyeeId = id;  
    }
    public void setEmployeeSalary(int salary) {
    	employeeSalary = salary;  
    }
    public void setEmployeeInitial(char initial) {
    	employeeInitial = initial;  
    }
    public int getEmployeeSalary() {
    	return employeeSalary;
    }
    public char getEmployeeInitial() {
    	return employeeInitial;
    }
    public int getEmployeeId() {
    	return empoyeeId;
    }
}
