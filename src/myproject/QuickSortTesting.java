/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.util.Arrays;

/**
 *
 * @author janicechau
 */

public class QuickSortTesting {
    public static void main(String[] args){
        int[] list = {23,31,1,21,36,72,42,13,54,67,45,79,87,12,13,145};
        System.out.println(Arrays.toString(list));
        
        QuickSort(list, 0, list.length-1);
        //Partition(list,0,list.length-1);
        System.out.println(Arrays.toString(list));
        
    }
    
    static int Partition(int[] arr, int leftIndex, int rightIndex){
        int pivot = arr[leftIndex];
        
        int i = leftIndex+1;
        int j = rightIndex;
        
        while(i <= j){
            
            while(arr[i] <= pivot){
                //System.out.println("Moved i:" + i + Arrays.toString(arr));
                    if(i < arr.length -1) {
                        i++;
                    }
                    else
                        break;
            }
            
            while(arr[j] >= pivot){
                //System.out.println("Moved j:" + j + Arrays.toString(arr));
                
                    if(j > 0)
                        j--;
                    else
                        break;
            }
            
            if(i < j){ //when no overlapping
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                //System.out.println("Swap! i,j = " + i + ", "+ j + Arrays.toString(arr));
                
                i++;
                j--;
                
                
            }
            else{
                
                //if(i > j){
                    arr[leftIndex] = arr[j];
                    arr[j] = pivot;
                
                //}
               
                
                //System.out.println("Swap pivot! arr[leftIndex], arr[j] " + arr[leftIndex] + ", " + arr[j]+ Arrays.toString(arr) );
                break;
            }
            
        }
        
        //System.out.println(Arrays.toString(arr));
        return j;
    }
    
    static void QuickSort(int[] arr, int left, int right){
        int pivotIndex = Partition(arr, left, right);
        //System.out.println("Pivot Index = " + pivotIndex  + Arrays.toString(arr));
        //System.out.println("Left = " + left);
        
        if(left < pivotIndex){
          //  System.out.println("QuickSort(arr, left, pivotIndex-1)");
            QuickSort(arr, left, pivotIndex-1);
        }
        
        if(right > pivotIndex){
            //System.out.println("QuickSort(arr, pivotIndex, right)");
            QuickSort(arr, pivotIndex +1, right);
        } 
    }
    
}

