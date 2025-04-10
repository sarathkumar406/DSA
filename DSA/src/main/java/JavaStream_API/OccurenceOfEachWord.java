package JavaStream_API;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachWord {

    public static void main(String[] args) {

        String str = "I am learning streams API in java java";

        Map<String, Long> res = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(res);
    }
}
