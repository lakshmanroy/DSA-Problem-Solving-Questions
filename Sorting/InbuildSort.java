package Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InbuildSort {

     public static void InbuildSorts(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct pos to insert
            while (prev>=0 && arr[prev]>=curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            arr[prev+1]=curr;
        }
    }
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]= {5,4,1,3,2};
        // Array.sort(arr,0,2);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);

    }
    
}
