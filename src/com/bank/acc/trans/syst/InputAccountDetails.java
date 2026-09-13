package com.bank.acc.trans.syst;

import java.util.ArrayList;
import java.util.List;

public class InputAccountDetails 
{
	public List<Account> getAccoutDetails()
	{
		ArrayList<Account> list = new ArrayList<Account>();
		
		list.add(new SavingsAccount("S101", "Rahul", 10000));

		list.add(new PremiumSavingsAccount("P101", "Amit", 20000));

		list.add(new CurrentAccount("C101", "Neha", 30000, 5000, 10));

		list.add(new SavingsAccount("S102", "Priya", 15000));

		list.add(new PremiumSavingsAccount("P102", "Rohit", 25000));

		list.add(new CurrentAccount("C102", "Sneha", 60000, 8000, 15));

		list.add(new SavingsAccount("S103", "Karan", 72000));

		list.add(new PremiumSavingsAccount("P103", "Anjali", 35000));

		list.add(new CurrentAccount("C103", "Vikram", 50000, 10000, 20));

		list.add(new SavingsAccount("S104", "Pooja", 18000));

		list.add(new PremiumSavingsAccount("P104", "Arjun", 45000));

		list.add(new CurrentAccount("C104", "Meera", 55000, 12000, 25));

		list.add(new SavingsAccount("S101", "Rahul", 10000));

		list.add(new CurrentAccount("C102", "Sneha", 40000, 8000, 15));
		
		return list;
	}
}
