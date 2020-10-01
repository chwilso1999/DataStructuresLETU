/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Transaction {
    
    private int customerNumber;
    private String transactionType;
    private double amount;
    private String fees;
    private String dateFinal;
    Transaction[] transaction = new Transaction[20];
    
    public Transaction(){
        super();
    }
    
    public Transaction(int customerNumber, String transactionType, double amount){
        super();
        this.customerNumber = customerNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }
    
    public int getCustomerNumber() {
        return customerNumber;
     }

     public void setCustomerNumber(int customerNumber) {
         this.customerNumber = customerNumber;
     }

     public String getTransactionType(){
         return transactionType;
     }

     public void setTransactionType(String transactionType){
         this.transactionType = transactionType;
     }

     public double getAmount(){
         return amount;
     }

     public void setAmount(double amount){
         this.amount = amount;
     }

     public String getFees() {
         return fees;
     }

     public String getDateFinal() {
         return dateFinal;
     }

     public void setDateFinal(String dateFinal){
          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          Date date = new Date(6/12/2017);
          this.dateFinal= dateFormat.format(date);
     }

     public void setFees(String fees) {
          this.fees = fees;
     }

     int i = 0;
     
     public void processTran(Transaction[] trans){
         
          for (int i = 0; i < trans.length; i++){
              if (trans[i] != null){
                   System.out.println(trans[i]);
               }
          }
     }

     @Override
     public String toString() {
          return "Transaction [customerNumber=" + customerNumber
                  + ", transactionType=" + transactionType + ", amount=" + amount +", Date=" + dateFinal+"]\n";
     }
}
