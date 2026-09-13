package com.bank.acc.trans.syst;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProcessAccounts 
{
	InputAccountDetails ipAccount = new InputAccountDetails();
	
	public void showAllAccounts()
	{
		List<Account> l = ipAccount.getAccoutDetails();
		
//		List<Account> allAccounts = l.stream().toList();
		
		for(Account acc : l)
		{
			System.out.println(acc.displayDetails());
		}
	}
	
	public void withoutDuplicateAccount()
	{	
		List<Account> l = ipAccount.getAccoutDetails();
		
		Set<Account> s = new HashSet<Account>(l);
		
		List<Account> duplicateRemoved = s.stream().distinct().collect(Collectors.toList());
		
		for(Account acc : duplicateRemoved)
		{
			System.out.println(acc.displayDetails());
		}
	}
	
	public void balanceGrThan50k()
	{
		List<Account> l = ipAccount.getAccoutDetails();
		
		List<Account> balanceGrrThan50k = l.stream().filter(x -> x.getBalance() > 50000).collect(Collectors.toList());
		
		for(Account acc : balanceGrrThan50k)
		{
			System.out.println(acc.displayDetails());
		}
	}
	public void onlyAccountHolderNames()
	{
		List<Account> l = ipAccount.getAccoutDetails();
		
		List<String> accHolderNames = l.stream().map(x -> x.getHolderName()).collect(Collectors.toList());
		
		accHolderNames.forEach(System.out::println);
		
//		accHolderNames.forEach(name -> System.out.println(name));

	}
	
	public void premiumSavingAccountFuns()
	{
		List<Account> l = ipAccount.getAccoutDetails();
		
		List<PremiumSavingsAccount> specificOpn = l.stream().filter(p -> p instanceof PremiumSavingsAccount)
				.map(p -> (PremiumSavingsAccount) p)
				.collect(Collectors.toList());
		for(PremiumSavingsAccount prmS : specificOpn)
		{
			prmS.applyCashback();
		}
	}
}
