package JavaStream_API;

import java.util.Arrays;

public class SumOfUniquieElements {

    public static void main(String[] args) {

        int[] arr = {1,6,7,8,1,1,8,8,6};

        int res = Arrays.stream(arr).distinct().sum();

        System.out.println(res);
    }
}
