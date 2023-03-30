package Encapsulation;

public class Bank {
private String custName;
private int AccNo;
private double balance;
public Bank(String custName, int accNo, double balance) {
	
	this.custName = custName;
	this.AccNo = accNo;
	this.balance = balance;
}
//getter method of custName
public String getCustName() {
	return this.custName;
}
//setter method of custName
public void setCustName(String custName) {
	this.custName=custName;
}
//getter method for accNo
public int getAccNo() {
	return this.AccNo;
}
//setter method of accno
public void setAccNo(int AccNo) {
	this.AccNo=AccNo;
}
//getter method for Balance
public double getBalance() {
	return this.balance;
}
//setter method of accno
public void setBalance(double balance) {
	this.balance=balance;
}
}
