
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class NewClass {
    public static void main(String []args)
    {
        BankAccount obj=new BankAccount("Sonali",1000,12,"shuvo","Bank Account");
        SavingsAccount obj1=new SavingsAccount(obj,123);
        obj1.dep(1200);
        obj1.printaccount();
        obj1.witdrw(120);
        obj1.printaccount();
        obj=obj1;
        DepositAccount obj2=new DepositAccount(obj,2000);
        obj2.printaccount();
        
        
        
    }
    
}
