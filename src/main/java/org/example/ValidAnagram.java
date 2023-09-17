package org.example;

import java.util.Arrays;

/*
 * 242. Valid Anagram
 * Easy
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */

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
