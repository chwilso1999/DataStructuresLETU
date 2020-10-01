/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
public class TestClass{
     public static void main(String[] args){
          Bank acc = new Bank();
          Account amt = new Account();
          acc.makeDeposit(12000);
          amt.toString();
          acc.makeWithdrawal(1000);
          acc.toString();
          amt.getBalance();
          amt.toString();
          Transaction t = new Transaction(1213,"MarkWell",12000);
          t.setTransactionType("Deposit");
          t.setAmount(12000);
          amt.getBalance();
          CheckingAccount ca = new CheckingAccount();
          ca.deposit(3000);
          t.toString();
     }

}