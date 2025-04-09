package org.example;

public class MaxSubArraySum {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int res = maxSubArraySum(arr);

        System.out.println(res);
    }

    private static int maxSubArraySum(int[] arr) {

        Integer max = Integer.MIN_VALUE;
        Integer sum = 0;

        for(int i =0;i<arr.length;i++){

            sum += arr[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum =0;
            }

        }
        return max;
    }
}
