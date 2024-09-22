package com.dio.bank;

public abstract class Accounts implements IAccounts {

    public Accounts(Clients client, Bank bank) {
        this.agencyNumber = Accounts.STANDARD_AGENCY;
        this.accountNumber = SEQUENTIAL++;
        this.client = client;
        this.bank = bank;
    }

    private Bank bank;
    private Clients client;

    private static final int STANDARD_AGENCY = 0001;
    private static int SEQUENTIAL = 1;


    private int agencyNumber;
    public int getAgencyNumber() {
        return agencyNumber;
    }

    private int accountNumber;
    public int getAccountNumber() {
        return accountNumber;
    }

    private double balance;
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(double value, Accounts targetAccount) {
        this.withdraw(value);
        targetAccount.deposit(value);
    }

    protected void extracted() {
        
        System.out.println(String.format("Bank: %s", this.bank.getBankName()));
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agencyNumber));
        System.out.println(String.format("Account: %d", this.accountNumber));
        System.out.println(String.format("Balance: %.2f", this.balance));
        
    }
}
