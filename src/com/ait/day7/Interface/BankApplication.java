package com.ait.day7.Interface;

public class BankApplication {
	public static void main(String[] args) {
		 Bank bank = new BankImp();
		 Account acc= new Account(111,"apoorva",20000,bank);
		 acc.deposit(2000); System.out.println(acc);
		 acc.withdraw(1899); 
		 System.out.println(acc);
		
	}

}
