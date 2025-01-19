package org.example;

public class LongestSubstringBruteForce {

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of longest substring: " + longestSubstring(input));
    }

    private static int longestSubstring(String str) {

        int n = str.length();
        int maxLength = 0;

        for(int i =0;i<n;i++){
            for(int j = i; j<n; j++){
                if(allUniques(str, i, j)){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;

    }

    private static boolean allUniques(String str, int start, int end) {

        boolean[] seen = new boolean[128];
        for(int i = start; i<=end;i++){
            if(seen[str.charAt(i)]){
                return false;
            }

            seen[str.charAt(i)] = true;
        }
        return true;
    }
}
