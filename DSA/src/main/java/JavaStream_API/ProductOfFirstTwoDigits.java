package JavaStream_API;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductOfFirstTwoDigits {
    public static void main(String[] args) {

        int[] arr = {6,6,6,7,8,9};

        int res = Arrays.stream(arr).boxed().collect(Collectors.toList())
                .stream().limit(2).reduce(1,(a,b)-> a * b);

        System.out.println(res);
    }
}
