/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class Account {
    private int accountNumber;
    private String holderName="";
    private String holderType="";
    Account (int number,String holdname,String holdtype)
    {
        accountNumber=number;
        holderName=holdname;
        holderType=holdtype;
    }
    Account()
    {
        
    }

    protected int getAccountNumber() {
        return accountNumber;
    }

    protected String getHolderName() {
        return holderName;
    }

    protected String getHolderType() {
        return holderType;
    }
    
    
}
