package com.lostoctet.dsalgo.array;

import java.util.Scanner;

public class MaxConsecutiveOnes {
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

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int len=scan.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the value of the Array Zero(0) and One(1) only:  ");
        for(int i = 0; i < len; i++) array[i]= scan.nextInt();
        System.out.println("Size of Maximum Consecutive 1 is= " + findMaxConsecutiveOnes(array));

    }
}
