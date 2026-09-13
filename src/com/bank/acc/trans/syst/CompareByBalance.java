package com.bank.acc.trans.syst;

import java.util.Comparator;

public class CompareByBalance implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {

		return a1.getBalance() - a2.getBalance();
	}

}
