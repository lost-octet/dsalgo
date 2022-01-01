package com.lostoctet.dsalgo.array;
import java.util.Scanner;

public class MaxConsecutiveOnes {

        //Brute force Approach
        public static int findMaxConsecutiveOnes(int[] nums) {
            int maxConsecutiveOnes=0;
            for (int i=0; i < nums.length; i++) {
                int currentCount=0;
                if (nums[i] == 1) {
                    int j = i;
                    do {
                        j++;
                        currentCount++;
                        if (j >= nums.length) break;
                    } while (nums[j] == 1);
                    if (maxConsecutiveOnes < currentCount) maxConsecutiveOnes = currentCount;
                }
            }
            return maxConsecutiveOnes;
        }

    //Another function solving the same problem in better memory and time complexity.
    public static int findMaxConsecutiveOnes1(int[] nums) {
        int maxConsecutiveOnes=0, currentCount=0;
        for (int i:nums) {
            if (i == 1) currentCount++;
            else currentCount=0;
            if(maxConsecutiveOnes < currentCount) maxConsecutiveOnes = currentCount;
        }
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int len=scan.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the value of the Array Zero(0) and One(1) only:  ");
        for(int i = 0; i < len; i++) array[i]= scan.nextInt();
        System.out.println("Size of Maximum Consecutive 1 is= " + findMaxConsecutiveOnes(array));
        System.out.println("Output using Other Function: " + findMaxConsecutiveOnes1(array));

    }
}
