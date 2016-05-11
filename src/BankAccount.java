/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BankAccount extends Account{
    private String bankName;
    private double balance;
    
    BankAccount(String name,double amount,int acnumber,String holdname,String holdtype)
    {
        super(acnumber,holdname,holdtype);
        bankName=name;
        balance=amount;
    }
    BankAccount(BankAccount obj)
    {
        super(obj.getAccountNumber(),obj.getHolderName(),obj.getHolderType());
        bankName=obj.bankName;
        balance=obj.balance;
    }
    BankAccount()
    {
    
    }
    protected double getBalance()
    {
        return balance;
    }
    protected String getName()
    {
        return bankName;
    }
    protected void depo(double dp)
    {
        balance=balance+dp;
    }
    protected void with(double wth)
    {
        balance=balance-wth;
        if(balance<100)balance=balance-(.02*wth);
    }
    protected int accountNumber=super.getAccountNumber();
    protected String holderName=super.getHolderName();
    protected String holderType=super.getHolderType();
    
}
