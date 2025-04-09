package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveAllZerotoEnd {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,0,-3,0,5,-2,0,8,0,-4);

        List<Integer> res = Stream.concat(numbers.stream().filter(n-> n!=0),numbers.stream().filter(n->n==0))
                .collect(Collectors.toList());

        System.out.println(res);

        int[] arr = {1,0,-3,0,5,-2,0,8,0,-4};

        int n = arr.length;

        int[] ans = new int[n];
        int val = 0;
        for(int i =0;i<n;i++ ){
            if(arr[i] != 0){
                arr[val++] = arr[i];
            }
        }

        while(val < n ){
            arr[val++] =0;
        }

        System.out.println(Arrays.toString(arr));


    }
}
