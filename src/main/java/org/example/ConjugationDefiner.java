package org.example;

import java.util.Set;

public class ConjugationDefiner {

    // first line - i, second line - e
    private static Set<Character> secondConjugationEndings = Set.of(
            'い', 'き', 'ぎ', 'し', 'じ', 'ち', 'ぢ', 'に', 'ひ', 'び', 'ぴ', 'み', 'り',
            'え', 'け', 'げ', 'せ', 'ぜ', 'て', 'で', 'ね', 'へ', 'べ', 'ぺ', 'め', 'れ'
    );

    private static Set<String> firstConjugationExceptions = Set.of(
            "かえる", "きる", "しる", "はいる"
    );

    public static Conjugation defineConjugation(String verb) {
        if (firstConjugationExceptions.contains(verb)) {
            return Conjugation.FIRST;
        }
        if (verb.equals("する") || verb.equals("くる")) {
            return Conjugation.THIRD;
        }
        char lastSymbol = verb.charAt(verb.length() - 2);
        if (verb.endsWith("る") && secondConjugationEndings.contains(lastSymbol)) {
            return Conjugation.SECOND;
        }
        return Conjugation.FIRST;
    }
}
