package org.example;

import static org.example.ReverseString.reverseString;

public class Palindrome {

    public static void main(String[] args) {

        String str = "liril";

        String str1 = reverseString(str);

        if(str.equalsIgnoreCase(str1)){
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }

    }
}
