package com.bank.acc.trans.syst;

public class BankTransactionTask implements Runnable
{
    private Account account;
    private boolean deposit;
    private int amount;

    public BankTransactionTask(Account account, boolean deposit, int amount)
    {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        if(deposit)
        {
            account.depositAmount(amount);
        }
        else
        {
            account.withdrawAmount(amount);
        }
    }
}