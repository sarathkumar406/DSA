package JavaStream_API;

import java.util.Arrays;

public class WordsWithVowelsCount {

    public static void main(String[] args) {

        String str = "I am learning streams API in java";

        Arrays.stream(str.split(" ")).filter(s -> s.replaceAll("[^aeiouAEIOU]","").length() == 2)
                .forEach(System.out::println);
    }
}
