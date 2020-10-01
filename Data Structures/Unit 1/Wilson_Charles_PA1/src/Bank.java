/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
import java.util.Scanner;

public class Bank {
    Account[] account = new Account[100];
    int count = 0;
    double balance = 0;
    
    public void reallocate() {
        if(account[99]==null){
            System.out.println("Not Full");
        } else {
            account = new Account[account.length * 2];
        }
    }
    
    public void addAccount() {
        
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter customer age: ");
        age = in.nextInt();
        System.out.println("Ennter account type: s = savings | c = checking");
        String bankchar = in.next();
        if(bankchar.equals("s")) {
            account[count] = new SavingsAccount();
        } 
        else if(bankchar.equals("c")) {
            account[count] = new CheckingAccount();
        }
        
        if(age > 65) {
            
            System.out.println("Enter account number: ");
            String accn_num = in.next();
            System.out.println("Enter current balance: ");
            float bal = in.nextFloat();
            account[count].setCustomer(accn_num, bal, new Senior());
        }
        
        if(age > 30 && age < 65) {
            System.out.println("Enter account number: ");
            String accn_num = in.next();
            System.out.println("Enter current balance: ");
            float bal = in.nextFloat();
            account[count].setCustomer(accn_num, bal, new Adult());
        }
        
        else {
            System.out.println("Enter account number: ");
            String accn_num = in.next();
            System.out.println("Enter current balance: ");
            float bal = in.nextFloat();
            account[count].setCustomer(accn_num, bal, new Student());
        }
            
            System.out.println("Enter customer name: ");
            account[count].customer.setName(in.next());
            System.out.println("Enter customer address: ");
            account[count].customer.setAddress(in.next());
            System.out.println("Enter customer number: ");
            account[count].customer.setCustomerNumber(in.next());
            System.out.println("Enter customer's telephone number: ");
            account[count].customer.setTelephoneNumber(in.next());
    }
    
    public void makeDeposit(double amount){
        balance = balance + amount;
    }
    
    public void makeWithdrawal(double amount){
        balance = balance - amount;
    }
    
    public Account[] getAccount() {
        return account;
    }
    
}
