package org.example;

public class TeFormConvertor {
    public static String convert(String verb) {
        Conjugation conjugation = ConjugationDefiner.defineConjugation(verb);

        if (conjugation == Conjugation.THIRD) {
            return switch (verb) {
                case "する" -> "して";
                case "くる" -> "きて";
                default -> throw new IllegalStateException("Unexpected value: " + verb);
            };
        }

        String withoutLastSymbol = verb.substring(0, verb.length() - 1);
        if (conjugation == Conjugation.SECOND) {
            return withoutLastSymbol.concat("て");
        }

        if (conjugation == Conjugation.FIRST) {
            if (verb.equals("いく")) {
                return "いって";
            }

            char lastSymbol = verb.charAt(verb.length() - 1);

            return withoutLastSymbol + switch (lastSymbol) {
                case 'う', 'つ', 'る' -> "って";
                case 'ぬ', 'ぶ', 'む' -> "んで";
                case 'く' -> "いて";
                case 'ぐ' -> "いで";
                case 'す' -> "して";
                default -> throw new IllegalStateException("Unexpected value: " + lastSymbol);
            };
        }
        return verb;
    }
}
