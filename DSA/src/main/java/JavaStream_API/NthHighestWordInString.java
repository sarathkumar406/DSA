package JavaStream_API;

import java.util.Arrays;
import java.util.Comparator;

public class NthHighestWordInString {

    public static void main(String[] args) {

        String str = "I am learning streams API in java";

        String res = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();

        int res_length = Arrays.stream(str.split(" "))
                .map(s ->s.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(res);
        System.out.println(res_length);
    }
}
