/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array.visualizer;

import static array.visualizer.ArrayVisualizer.*;
import static array.visualizer.Swaps.*;

/**
 *
 * @author S630690
 */
public class DoubleSelection {
    public static void doubleSelectionSort(int[] arr) {
        
        int left = 0;
        int right = arr.length-1;
        int smallest = 0;
        int biggest = 0;
        while(left<=right){
            for(int i = left; i <= right; i++){
                if(arr[i]>arr[biggest])
                    biggest = i;
                if(arr[i]<arr[smallest])
                    smallest = i;
                comps+=2;
            }
            if(biggest==left)
                biggest = smallest;
            swap(arr, left, smallest, sleepTime(0.01));
            swap(arr, right, biggest, sleepTime(0.01));
            left++;
            right--;
            smallest = left;
            biggest = right;
        }
    }
}
