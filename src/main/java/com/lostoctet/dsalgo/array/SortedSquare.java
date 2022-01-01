package com.lostoctet.dsalgo.array;

import java.util.Scanner;

public class SortedSquare {

    public static int[] sortedSquares(int[] nums) {
        short len=(short)nums.length, left=0, right=(short)(len-1);
        int[] square = new int[len];

        for(short index=(short)(len-1); index >= 0; index--){
            if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                square[index] = nums[right] * nums[right];
                right--;
            } else {
                square[index] = nums[left] * nums[left];
                left++;
            }
        }
        return square;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int len=scan.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the Value of the Sorted Array: ");
        for(int i = 0; i < len; i++) array[i]= scan.nextInt();
        int[] square = sortedSquares(array);
        for(int i = 0; i < len; i++)
            System.out.println(square[i]);
    }
}
