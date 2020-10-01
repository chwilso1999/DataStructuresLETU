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
 * 
 * Test List:
 * 1. Not enough elements in given args
 * 2. Incorrect output/ logic error
 */
public class SmallestInArray_TDDTest {
    
    public SmallestInArray_TDDTest() {
    }

    @Test
    public void testFindSmallest_Norm() {
        int tdd_Array[] = new int[]{99, 22, 33, 454, 1, 5, 3, 6};
        int expResult = 1;
        int result = SmallestInArray_TDD.findSmallest(tdd_Array);
        assertEquals("Error with Logic: Should have returned \"0\"", 
                expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testFindSmallest_Null() {
        int tdd_Array[] = null;
        int expResult = 0;
        int result = SmallestInArray_TDD.findSmallest(tdd_Array);
        assertEquals("Error with Null input: Should have returned \"0\"",
                expResult, result);
    }
}
