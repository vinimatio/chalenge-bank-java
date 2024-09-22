package com.dio.bank;

public class SavingsAccounts extends Accounts {

    public SavingsAccounts(Clients client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void printExtract() {
        System.out.println("===Saving Account Extract===");
        extracted();
    }

}
