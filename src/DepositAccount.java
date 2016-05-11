/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DepositAccount extends BankAccount{
    private double depositAmount;
    private int countChecks=0;
    DepositAccount(String name,double amount,int acnumber,String holdname,String holdtype,double damount)
    {
         super(name,amount,acnumber,holdname,holdtype);
         if(super.getBalance()>10000)super.depo(damount);
         countChecks=countChecks+1;
    }
    DepositAccount(BankAccount obj,double damount)
    {
        super(obj);
        if(super.getBalance()>1000)super.depo(damount);
         countChecks=countChecks+1;
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
