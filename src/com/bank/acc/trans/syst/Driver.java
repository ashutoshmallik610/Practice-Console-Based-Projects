package com.bank.acc.trans.syst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		InputAccountDetails input = new InputAccountDetails();

		List<Account> accounts = input.getAccoutDetails();

		ProcessAccounts process = new ProcessAccounts();

		int choice;

		do {

			System.out.println("\n==========================================");
			System.out.println("        BANK ACCOUNT TRANSACTION SYSTEM");
			System.out.println("==========================================");

			System.out.println("1. Display All Accounts");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Remove Duplicate Accounts");
			System.out.println("5. Traverse Accounts Using Iterator");
			System.out.println("6. Sort Accounts By Balance");
			System.out.println("7. Find Balance Greater Than ₹50,000");
			System.out.println("8. Extract Account Holder Names");
			System.out.println("9. Premium Savings Account Operation");
			System.out.println("10. Generate Account Statement");
			System.out.println("11. Check Balance");
			System.out.println("12. Multithreading Transaction");
			System.out.println("0. Exit");

			System.out.print("\nEnter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			// =====================================================
			// CASE 1 : DISPLAY ALL ACCOUNTS
			// =====================================================

			case 1:

				System.out.println("\n========== ALL ACCOUNTS ==========");

				process.showAllAccounts();

				break;

			// =====================================================
			// CASE 2 : DEPOSIT
			// =====================================================

			case 2:

				System.out.println("\n========== DEPOSIT ==========");

				System.out.print("Enter Account Number: ");
				String depositAccNo = sc.next();

				boolean depositAccountFound = false;

				for (Account acc : accounts) {

					if (acc.getAccNumber().equals(depositAccNo)) {

						acc.deposit();

						depositAccountFound = true;

						break;
					}
				}

				if (!depositAccountFound) {

					System.out.println("Account not found.");
				}

				break;

			// =====================================================
			// CASE 3 : WITHDRAW
			// =====================================================

			case 3:

				System.out.println("\n========== WITHDRAW ==========");

				System.out.print("Enter Account Number: ");
				String withdrawAccNo = sc.next();

				boolean withdrawAccountFound = false;

				for (Account acc : accounts) {

					if (acc.getAccNumber().equals(withdrawAccNo)) {

						acc.withdraw();

						withdrawAccountFound = true;

						break;
					}
				}

				if (!withdrawAccountFound) {

					System.out.println("Account not found.");
				}

				break;

			// =====================================================
			// CASE 4 : HASHSET - REMOVE DUPLICATES
			// =====================================================

			case 4:

				System.out.println("\n========== REMOVE DUPLICATES ==========");

				process.withoutDuplicateAccount();

				break;

			// =====================================================
			// CASE 5 : ITERATOR
			// =====================================================

			case 5:

				System.out.println("\n========== ITERATOR TRAVERSAL ==========");

				Iterator<Account> iterator = accounts.iterator();

				while (iterator.hasNext()) {

					Account acc = iterator.next();

					System.out.println(acc.displayDetails());
				}

				break;

			// =====================================================
			// CASE 6 : COMPARATOR
			// =====================================================

			case 6:

				System.out.println("\n========== SORT BY BALANCE ==========");

				ArrayList<Account> sortedAccounts = new ArrayList<>(accounts);

				sortedAccounts.sort(new CompareByBalance());

				for (Account acc : sortedAccounts) {

					System.out.println(acc.getAccNumber() + " | " + acc.getHolderName() + " | ₹" + acc.getBalance());
				}

				break;

			// =====================================================
			// CASE 7 : STREAM
			// BALANCE GREATER THAN ₹50,000
			// =====================================================

			case 7:

				System.out.println("\n========== BALANCE GREATER THAN ₹50,000 ==========");
				process.balanceGrThan50k();
				break;

			// =====================================================
			// CASE 8 : STREAM
			// EXTRACT ACCOUNT HOLDER NAMES
			// =====================================================

			case 8:

				System.out.println("\n========== ACCOUNT HOLDER NAMES ==========");
				process.onlyAccountHolderNames();
				break;

			// =====================================================
			// CASE 9 :
			// INSTANCEOF + DOWNCASTING
			// =====================================================

			case 9:

				System.out.println("\n========== PREMIUM SAVINGS ACCOUNT ==========");
				process.premiumSavingAccountFuns();
				break;
			// =====================================================
			// CASE 10 :
			// STRINGBUILDER ACCOUNT STATEMENT
			// =====================================================

			case 10:

				System.out.println("\n========== ACCOUNT STATEMENT ==========");

				StringBuilder statement = new StringBuilder();

				statement.append("\n==========================================\n");

				statement.append("           ACCOUNT STATEMENT\n");

				statement.append("==========================================\n");

				for (Account acc : accounts) {

					statement.append("Account Number : ");

					statement.append(acc.getAccNumber());

					statement.append("\n");

					statement.append("Holder Name    : ");

					statement.append(acc.getHolderName());

					statement.append("\n");

					statement.append("Balance        : ₹");

					statement.append(acc.getBalance());

					statement.append("\n");

					statement.append("------------------------------------------\n");
				}

				System.out.println(statement);

				break;

			case 11:

				System.out.println("\n========== CHECK BALANCE ==========");

				System.out.print("Enter Account Number: ");
				String balanceAccNo = sc.next();

				boolean balanceAccountFound = false;

				for (Account acc : accounts) {
					if (acc.getAccNumber().equals(balanceAccNo)) {
						if (acc instanceof SavingsAccount) {
							SavingsAccount sa = (SavingsAccount) acc;
							sa.checkBalance();
						} else if (acc instanceof CurrentAccount) {
							CurrentAccount ca = (CurrentAccount) acc;
							ca.checkBalance();
						}

						balanceAccountFound = true;
						break;
					}
				}

				if (!balanceAccountFound) {
					System.out.println("Account not found.");
				}

				break;

			// =====================================================
			// CASE 12 : MULTITHREADING TRANSACTION
			// =====================================================

			case 12:

				System.out.println("\n========== MULTITHREADING TRANSACTION ==========");

				Account account = accounts.get(0);

				System.out.println("Account Number : " + account.getAccNumber());
				System.out.println("Initial Balance: ₹" + account.getBalance());

				BankTransactionTask depositTask = new BankTransactionTask(account, true, 10000);

				BankTransactionTask withdrawTask = new BankTransactionTask(account, false, 5000);

				Thread thread1 = new Thread(depositTask, "Thread-1");
				Thread thread2 = new Thread(withdrawTask, "Thread-2");

				thread1.start();
				thread2.start();

				try 
				{
					thread1.join();
					thread2.join();
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("\nFinal Balance: ₹" + account.getBalance());

				break;

			// =====================================================
			// CASE 0 : EXIT
			// =====================================================

			case 0:

				System.out.println("\nThank you for using Bank Account System.");

				break;

			// =====================================================
			// DEFAULT
			// =====================================================

			default:

				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 0);

		sc.close();
	}
}