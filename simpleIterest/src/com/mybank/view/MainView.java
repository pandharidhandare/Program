package com.mybank.view;
import com.mybank.service.LoanAccountService;
public class MainView {

	public static void main (String[] args) {
		LoanAccountService loanAccServiceObj=new LoanAccountService();
		loanAccServiceObj.CalculateInterest(10, 1000, 10);
	
double interest =loanAccServiceObj.CalculateInterest(10, 1000, 10);
System.out.println(interest);
	}
	
}