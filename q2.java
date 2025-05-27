// Write a program to check whether two given strings are anagram or not

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        System.out.println(fn2(s1, s2)?"Yes, given strings are anagrams": "No, given strings are not anagrams");
    }

    public static boolean fn(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        
        char [] ar1 = s1.toCharArray();
        char [] ar2 = s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        return Arrays.equals(ar1, ar2);
    }

    public static boolean fn2(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int count [] = new int[26];

        for(int i = 0; i  < s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}