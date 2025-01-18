package org.example;

import static org.example.ReverseString.reverseString;


// 2. Check if a String is a Palindrome, Ignoring Case
public class Palindrome {

    public static void main(String[] args) {

        String str = "liril";
        boolean res = checkPalindrome(str);
        System.out.println(res);
        String str1 = reverseString(str);

        if(str.equalsIgnoreCase(str1)){
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }

    }

    private static boolean checkPalindrome(String str) {

        int Start = 0;
        int end = str.length()-1;

        while(Start < end ){
            if(str.charAt(Start) != str.charAt(end)){
                return false; // Not a Palindrome
            }
            Start++;
            end--;
        }
        return true; // Its a Palindrome
    }
}
