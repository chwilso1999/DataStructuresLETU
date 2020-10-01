/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charles
 */

public class SmallestInArray{
    
    static int findSmallest(int arr[]){
        
        if(arr.length < 2){ //Catches incorrect input, needs 2 elements to compare
            System.out.println("Invalid Array: Must Have Array of Size 2 or"
                    + " Greater");
            return 404;
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        return min;
    }
}

