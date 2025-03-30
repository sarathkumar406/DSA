package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 18;

       int[] res =  twoSum(arr, target);

        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            int current = target - arr[i];
            if(hm.containsKey(current)){
                return new int[] {hm.get(current), i};
            }
            hm.put(arr[i], i);
        }
        return new int[] {};
    }
}
