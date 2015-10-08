/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.util.Scanner;

/**
 *
 * @author janicechau
 */
public class BinarySearch_withRecrusive {
    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        
        System.out.println("Enter a integer number: ");
        
        //Ask for a number
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        
        System.out.println(findCharacter(array, 0, array.length-1, element));
    }
    
    static Boolean findCharacter(int[] number, int s, int e, int element) {

        int middle = (s + e) / 2;
        
        if(e < s){
            return false;
        }
       
        if(element == number[middle]){
            return true;
        }
        else if(element > number[middle]){
            return findCharacter(number, middle+1, e, element);
        }
        else{
            return findCharacter(number, s, middle-1, element);
        }
     
    }
}




