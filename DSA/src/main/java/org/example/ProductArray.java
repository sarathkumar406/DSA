package org.example;

import java.util.Arrays;

public class ProductArray {

    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 6, 2};
//        int[] arr = {0,12};
        checkProductArray(arr);
        productWithPrefixandSuffix(arr);
        productWithPrefixandSuffixOptimized(arr);

    }

    private static void productWithPrefixandSuffixOptimized(int[] arr) {

        int[] product = new int[arr.length];
        int[] prefix = new int[arr.length];
        prefix[0] = 1;
        for(int i = 1; i<arr.length;i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }
        int suffixProduct = 1;
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            product[i] = suffixProduct * prefix[i];
            suffixProduct = suffixProduct * arr[i];

        }

        System.out.println(Arrays.toString(product));

    }

    private static void productWithPrefixandSuffix(int[] arr) {

        int[] product = new int[arr.length];
        int[] prefix = new int[arr.length];
        prefix[0] = 1;
        for(int i = 1; i<arr.length;i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        int[] suffix = new int[arr.length];
        int n = arr.length;
        suffix[n-1] = 1;

        for(int i = n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        for(int i =0;i<n;i++){
            product[i] = prefix[i] * suffix[i];
        }
        System.out.println("product "+Arrays.toString(product));
    }

    private static void checkProductArray(int[] arr) {

        int[] res = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            int product = 1;
            for(int j = 0;j<arr.length;j++){
                if(i != j) {
                    product = product * arr[j];
                }
            }
            res[i] = product;
        }

        System.out.println(Arrays.toString(res));
    }
}
