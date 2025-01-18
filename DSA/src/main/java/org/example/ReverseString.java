package org.example;


//1. Reverse a String Without Using Built-in Functions
public class ReverseString {

    public static void main(String[] args) {

        String str = "Sarat";
           String res  = reverseString(str);
        System.out.println("results through method "+res);
        char[] strArr = str.toCharArray();
        int n = strArr.length-1;
        for(int i = n; i >= 0 ; i--){
            char c = strArr[i];
            strArr[i] = c;
            System.out.print(strArr[i]);
        }
        System.out.println();

        System.out.println(String.valueOf(strArr));
    }

    private static String reverseString(String str) {

        char[] strArr = str.toCharArray();
        int n = strArr.length;

        for(int i =0;i<n/2;i++){
            char temp = strArr[i];
            strArr[i] = strArr[n-i-1];
            strArr[n-i-1] = temp;
        }
        return new String(strArr);

    }
}
