/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charles
 */
public class SmallestInArrayTest {
    
    public SmallestInArrayTest() {
    }

    /**
     * Test of findSmallest method, of class SmallestInArray.
     */
    
    @Test //Testing for correct output logic
    public void testFindSmallest_Norm() {
        System.out.println("findSmallest_Norm");
        int[] exampleArr = new int[]{1, 50, 90, 45, 20, 13, 7};
        int expResult = 1;
        int result = SmallestInArray.findSmallest(exampleArr);
        assertEquals("Error with Normal input: should return \"1\"", 
                expResult, result);
    }
    
    @Test(expected = NullPointerException.class) //Standard expected NullPointer
    //error, should Main or user input go out of Array bounds.
    public void nullArrayTest(){
        int[] exampleArr = null;
        int result = SmallestInArray.findSmallest(exampleArr);
    }
}
