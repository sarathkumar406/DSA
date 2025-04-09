package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class MaxWordLength {

        public static void main(String[] args)
        {
            String str = "I am learning Stream API in java";

            String res = Arrays.stream(str.split(" "))
                    .max(Comparator.comparing(String::length))
                    .get();

            System.out.println(res);
        }
}
