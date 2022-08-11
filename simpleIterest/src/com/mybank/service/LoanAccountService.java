package com.mybank.service;

public class LoanAccountService {

     int loneId;
	 int loanAmount;
	 int rateOfInterest;
	 int time;
	public double CalculateInterest(int Amount,int Interest,int t) {
	loanAmount=Amount;
    rateOfInterest=Interest;
    time=t;

	 
		double interest =(loanAmount*rateOfInterest*time)/100;
		return interest;
	}	
}