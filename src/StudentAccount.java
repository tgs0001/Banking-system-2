/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StudentAccount extends Account {
    private String institute;
    private String status;
    StudentAccount(String str1,String str2,int acnumber,String holdname,String holdtype)
    {
        super(acnumber,holdname,holdtype);
        institute=str1;
        status=str2;
    }
    StudentAccount()
    {
        
    }
    
}
