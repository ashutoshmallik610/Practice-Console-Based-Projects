package com.minibank;

public class Driver {

    public static void main(String[] args) {

        Account account = new Account("ACC101", "SBIN0001234", 100000);

        BankService bankService = new BankService();
        TransactionService transactionService = new TransactionService();

        account.accountDetails();
        

        System.out.println("\n===== DEPOSIT =====");

        try 
        {
            bankService.deposit(account, 10000);
        }
        catch (InvalidAmountException e) 
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== WITHDRAW =====");

        try 
        {
            bankService.withdraw(account, 20000);
        }
        catch (InvalidAmountException e) 
        {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== TRANSFER =====");

        try 
        {
            transactionService.transfer(account, 30000);
        }
        catch (InvalidAmountException e) 
        {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) 
        {
            System.out.println(e.getMessage());
        }
        catch (TransferLimitExceededException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("\n===== FINAL BALANCE =====");

        bankService.checkBalance(account);
    }
}