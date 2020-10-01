/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
public class CheckingAccount extends Account {
    
    float amount;
    
    public void deposit(float amount) {
        balance = balance + amount;
    }
    
    public boolean withdraw(float amount) {
        
        if(balance < amount) {
            System.out.println("Insufficient funds.");
            return true;
        } else {
            balance = balance - amount;
            return false;
        }
    }
    
    public void addInterest(float interest, int months) {
        
        amount = (balance * interest * months)/ 100 * 12;
        balance = balance + amount;
        
    }
}
