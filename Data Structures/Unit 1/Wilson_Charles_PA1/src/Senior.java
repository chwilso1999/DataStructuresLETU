/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
public class Senior extends Customer{
    
    final float SAVINGS_INTEREST=8, CHECK_INTEREST=9, CHECK_CHARGE=2, OVERDRAFT_PENALTY=1;
    
    public float getCheckCharge() {
        return CHECK_CHARGE;
    }
    
    public float getSavingsInterest(){
        return SAVINGS_INTEREST;
    }
    
    public float getCheckInterest(){
        return CHECK_INTEREST;
    }
    
    public float getOverdraftPenalty(){
        return OVERDRAFT_PENALTY;
    }
}
