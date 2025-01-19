package org.example;

import java.util.HashMap;

public class LongestSubstringOptimized {
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of longest substring: " + longestSubstringOptimized(input));
    }

    private static int longestSubstringOptimized(String input) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for(int i =0;i<input.length();i++){
            char currentChar = input.charAt(i);

            if(hm.containsKey(currentChar)){
                start = Math.max(start, hm.get(currentChar)+1);
            }
            hm.put(currentChar,i);

            maxLength = Math.max(maxLength, i - start + 1 );

        }
        return maxLength;
    }
}
