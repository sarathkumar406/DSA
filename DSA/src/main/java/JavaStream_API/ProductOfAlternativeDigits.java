package JavaStream_API;

import java.util.stream.IntStream;

public class ProductOfAlternativeDigits {

    public static void main(String[] args) {

        int[] arr = {4,5,1,7,2,5,2};

        int res = IntStream.range(0,arr.length).filter(x->x%2 == 0).map(x->arr[x])
                .reduce(1,(a,b)-> a * b);

        System.out.println(res);
    }
}
