/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the original, non-TDD version of the program.
 * @author Charles
 */

public class Main{
    public static void main(String[] args){
        int[] exampleArr = new int[]{50,3,0,20,13,4};
        int smallest = SmallestInArray.findSmallest(exampleArr);
        System.out.println("NON-TDD: The smallest element from the given array: "
                + smallest);
        
        int small_TDD = SmallestInArray_TDD.findSmallest(exampleArr);
        System.out.println("TDD: The smallest element from the given array: " +
                small_TDD);
    }
}