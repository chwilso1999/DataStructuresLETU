/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
public abstract class Customer {
    
        String name;
        String address;
        String customerNumber;
        String telephoneNumber;
        int age;
        
        public abstract float getSavingsInterest();
        public abstract float getCheckInterest();
        public abstract float getCheckCharge();
        
        public void setName(String name){
            this.name = name;
        }
        
        public String getName(){
            return name;
        }
        
        public void setAddress(String address){
            this.address = address;
        }
        
        public String getAddress(){
            return address;
        }
        
        public void setTelephoneNumber(String telephoneNumber){
            this.telephoneNumber = telephoneNumber;
        }
        
        public String getTelephoneNumber(){
            return telephoneNumber;
        }
        
        public void setCustomerNumber(String customerNumber){
            this.customerNumber = customerNumber;
        }
        
        public String getCustomerNumber(){
            return customerNumber;
        }
        
        public void setAge(int age){
            this.age = age;
        }
        
        public int getAge(){
            return age;
        }
}
