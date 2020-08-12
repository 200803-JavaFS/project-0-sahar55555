package com.revature.services;
 import com.revature.models.Account;
public class AccountServices {
	
	// This class is about the Bank methods that will be run by the user
	Account acc=new Account();
	
	double money=acc.getBalance();
	
	public void deposit(double amt)
	{
		money+=amt;
		acc.setBalance(money);
		System.out.println("Your Balance is "+money);
	}
	
	public void withdraw(double amt) {
		if(money>amt)
		{
			money-=amt;
			acc.setBalance(money);
			System.out.println("Your Balance after withdraw is: "+acc.getBalance());
		
			if(money<amt) {
				System.out.println("Your trnasaction is invalid");
			}
		} 
	}
		public void trasfer(double amt, Account other){
			if(money>amt) {
				withdraw(amt);
				other.setBalance(other.getBalance()+amt);
				
			}
			System.out.println("Your money has successfully transfered, and your new balance is : "+acc.getBalance());
			System.out.println("Thanks for your business with our bank ");
		}
	
}
