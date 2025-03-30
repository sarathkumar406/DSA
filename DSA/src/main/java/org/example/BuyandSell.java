package org.example;

public class BuyandSell {

    public static void main(String[] args) {

        int[] Arr  ={7,1,5,3,6,4};

       int res =  maxProfit(Arr);
        System.out.println("result is "+ res);
    }

    private static int maxProfit(int[] arr) {

        int maxProfit = 0;
        int mini = arr[0];

        for(int i = 1 ;i<arr.length;i++){
            int currProfit = arr[i] - mini;

            maxProfit = Math.max(maxProfit, currProfit);
            mini = Math.min(mini, arr[i]);

        }

        return maxProfit;
    }

}
