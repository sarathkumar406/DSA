package org.example;
// Count the Number of Vowels and Consonants in a String
public class NoOfVowels {

    public static void main(String[] args) {

        String str = "Sarat";
        countVowelsAndConsonants(str);
    }

    private static void countVowelsAndConsonants(String str) {

        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if(ch >= 'a' && ch <= 'z'){
                consonants++;
            }
        }
        System.out.println("Vowels count is "+vowels);
        System.out.println("Consonants count is "+consonants);
    }
}
