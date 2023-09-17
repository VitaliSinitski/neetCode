package org.example;

import java.security.spec.RSAOtherPrimeInfo;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s;
        s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z]", "");
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }

    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String s2 = new StringBuilder(s).reverse().toString();
        return s.equals(s2);
    }
}
