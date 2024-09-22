package com.dio.bank;

public interface IAccounts {

    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, Accounts targetAccount);

    void printExtract();
}
