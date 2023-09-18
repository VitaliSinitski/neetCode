package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * a  4
 * b  3
 * c  5
 * d  6
 */

public class LetterCount {
    public static void main(String[] args) {
        String str = "aaaabbbcccccdddddd";
        System.out.println(counter(str));

    }

    public static HashMap<Character, Integer> counter(String s) {
        HashMap<Character, Integer> characterMap = new HashMap();
        for (char c: s.toCharArray()) {
            if (characterMap.containsKey(c)) {
                characterMap.replace(c, characterMap.get(c) + 1);
            } else {
                characterMap.put(c, 1);
            }
        }
        return characterMap;
    }
}
