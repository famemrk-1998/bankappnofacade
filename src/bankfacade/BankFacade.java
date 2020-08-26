/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       MyFacade obj = new MyFacade();
       AccountIf acc;
       //First customer
       CustomerIf customer1 = obj.getBankCustomer("John");
       System.out.println("Customer and account information");
       System.out.println("Name = " + customer1.getCustomerName());
       System.out.println("Has " + customer1.getNumAccounts() + " accounts");
       //Set account number
       acc = obj.getBankAccount(customer1, 12345);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       acc = obj.getBankAccount(customer1, 12346);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());

       obj.doDeposit(1000, customer1, 12346);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       ArrayList<AccountIf> accounts1 = obj.getBankCustomer("John").getllAccounts();
       for(AccountIf account : accounts1) {
           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }

       CustomerIf customer2 = obj.getBankCustomer("Joe");
       System.out.println("Customer and account information");
       System.out.println("Name = " + customer2.getCustomerName());
       System.out.println("Has " + customer2.getNumAccounts() + " accounts");

       acc = obj.getBankAccount(customer2, 12347);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       acc = obj.getBankAccount(customer2, 12348);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());

       obj.doDeposit(1000, customer2, 12348);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());

       ArrayList<AccountIf> accounts2 = obj.getBankCustomer("Joe").getllAccounts();
       for(AccountIf accounte : accounts2) {
       System.out.println("Account number " + accounte.getAccountNumber() + " has " + accounte.getBalance());
    }
    
}
}
