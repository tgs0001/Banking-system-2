/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BasicAccount extends BankAccount{
    private double checkAmount;
    private int countChecks=0;
    private int checkbookNo;
    BasicAccount(String name,double amount,int acnumber,String holdname,String holdtype,double ckamount,int book)
    {
        super(name,amount,acnumber,holdname,holdtype);
        checkAmount=ckamount;
        checkbookNo=book;
        countChecks=countChecks+1;
        if(countChecks%10==1)super.with(10);
    }
    BasicAccount(BankAccount obj,double ckamount,int book)
    {
        super(obj);
        checkAmount=ckamount;
        countChecks=countChecks+1;
        if(countChecks%10==1)super.with(10);
    }
    BasicAccount(double ckamount,int book)
    {
        checkAmount=ckamount;
        countChecks=countChecks+1;
        if(countChecks%10==1)super.with(10);
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
