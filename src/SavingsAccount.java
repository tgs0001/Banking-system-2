/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SavingsAccount extends BankAccount{
    private double depositAmount;
    private double withdrawalAmount;
    private int passbookNo;
    SavingsAccount(String name,double amount,int acnumber,String holdname,String holdtype,int pass)
    {
        super(name,amount,acnumber,holdname,holdtype);
        passbookNo=pass;
        
    }
    SavingsAccount(BankAccount obj,int pass)
    {
        super(obj);
        passbookNo=pass;
    }
    public void dep (double dp)
    {
        super.depo(dp);
        depositAmount=dp;
    }
    public void witdrw(double wd)
    {
        super.with(wd);
        withdrawalAmount=wd;
    }
    public void printaccount()
    {
        System.out.println("Bank Name: "+super.getName());
        System.out.println("Account Number: "+super.accountNumber);
        System.out.println("Account's Holders name: "+super.holderName);
        System.out.println("Account's Holders type: "+super.holderType);
        System.out.println("After depositting Amount: "+super.getBalance());
        System.out.println("After Withdrwaing Amount: "+super.getBalance());
        
    }
}
