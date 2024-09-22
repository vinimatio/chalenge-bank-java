package com.dio.bank;

public class CheckingAccounts extends Accounts {

    public CheckingAccounts(Clients client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void printExtract() {
        System.out.println("===Checking Account Extract===");
        extracted();
    }
}
