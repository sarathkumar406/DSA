package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        boolean res = duplicateCheck(nums);
        System.out.println("result of duplicateCheck "+res);

       boolean res1 = duplicateCheckWithSort(nums);
        System.out.println("result of duplicateCheckWithSort "+res1);

        boolean res3 = duplicateCheckOptimized(nums);

        System.out.println("result of duplicateCheckOptimized "+res3);
    }

    private static boolean duplicateCheckOptimized(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        return hs.size() < nums.length;
    }

    //Solution 2
    private static boolean duplicateCheckWithSort(int[] nums) {

        Arrays.sort(nums);

        for(int i =1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    //Solution 1
    private static boolean duplicateCheck(int[] nums) {

        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }



}

