package JavaStream_API;

import java.util.Arrays;

public class RemoveDuplicatesInString {

    public static void main(String[] args) {

        String str  =  "dabcadefg";

        str.chars().distinct().mapToObj(s -> (char)s).forEach(System.out::print);
        System.out.println();
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);


    }
}
