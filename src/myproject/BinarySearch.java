/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author janicechau
 */
public class BinarySearch {
    public static void main(String[] args){
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(findCharacter(array, 0, array.length-1, 30));
    }
    
    static Boolean findCharacter(int[] number, int s, int e, int element) {

        int middle = (s + e) / 2;
        
        if(s == e){
            return false;
        }
        else{
            if(element == number[middle]){
                return true;
            }
            else if(element > number[middle]){
                return findCharacter(number, middle, number.length-1, element);
            }
            else if(element < number[middle]){
                return findCharacter(number, 0, middle-1, element);
            }
        }
        return null;
    }
}




