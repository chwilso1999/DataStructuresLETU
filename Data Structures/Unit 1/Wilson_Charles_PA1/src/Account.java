/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
public class Account {
    
    Customer customer;
    float balance;
    String accountNumber;
    Transaction[] transactions = new Transaction[20];
    
    public void reallocate() {
        
        if(transactions[19]!=null)
            transactions = new Transaction[transactions.length*2];
        else
            System.out.println("Not full");
    }
    
    public float getBalance() {
        return balance;
    }
    
    public String accountNumber() {
        return accountNumber;
    }
    
    public String toString() {
        return "Balance: "+ balance + " account Number: " + accountNumber;
    }
    
    public void setCustomer(String accountNumber, float balance, Customer customer) {
        
        this.customer=customer;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
}