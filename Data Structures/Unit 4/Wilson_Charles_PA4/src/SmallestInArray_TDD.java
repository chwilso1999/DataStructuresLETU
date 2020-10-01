/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */
public class SmallestInArray_TDD{
    
    static int findSmallest(int arr[]){
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        return min;
    }
}
