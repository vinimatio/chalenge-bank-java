package com.dio.bank;

public class App {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setBankName("Java Bank");

        Clients client = new Clients();
        client.setName("Vini Best Client");

        CheckingAccounts checkingAccounts = new CheckingAccounts(client, bank);
        SavingsAccounts savingsAccounts = new SavingsAccounts(client, bank);

        checkingAccounts.deposit(1500);
        checkingAccounts.transfer(1000, savingsAccounts);

        checkingAccounts.printExtract();
        savingsAccounts.printExtract();
        
    }
}
