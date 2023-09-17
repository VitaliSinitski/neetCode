package org.example;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s;
        String t;
//        s = "anagram";
//        t = "nagaram";
        s = "rat";
        t = "car";
        System.out.println(isAnagramChar(s, t));
    }

    public static boolean isAnagramChar(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

}
