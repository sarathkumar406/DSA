package JavaStream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenandOddList {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Boolean, List<Integer>> res = list.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0));
        List<List<Integer>> finalResult = new ArrayList<>(res.values());


        System.out.println(res);
        System.out.println(finalResult);

    }
}
