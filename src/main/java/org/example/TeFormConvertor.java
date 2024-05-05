package org.example;

public class TeFormConvertor {
    public static String convert(String verb){
        if (ConjugationDefiner.defineConjugation(verb).equals(Conjugation.THIRD)){
            switch (verb){
                case "する" : return "して";
                case "くる" : return "きて";
            }
        }

        if (ConjugationDefiner.defineConjugation(verb).equals(Conjugation.SECOND)){
            return verb.substring(0, verb.length() - 1 ).concat("て");
        }
// って　　
        if (ConjugationDefiner.defineConjugation(verb).equals(Conjugation.FIRST)){
            if (verb.equals("いく")) { return "いって"; }

            char lastSymbol = verb.charAt(verb.length() - 1);

            if (lastSymbol == 'う' || lastSymbol == 'つ' || lastSymbol == 'る' ){
                return verb.substring(0, verb.length() - 1 ).concat("って");
            }
            if (lastSymbol == 'ぬ' || lastSymbol == 'ぶ' || lastSymbol == 'む'){
                return verb.substring(0, verb.length() - 1 ).concat("んで");
            }
            if (lastSymbol == 'く'){
                return verb.substring(0, verb.length() - 1 ).concat("いて");
            }
            if (lastSymbol == 'ぐ'){
                return verb.substring(0, verb.length() - 1 ).concat("いで");
            }
            if (lastSymbol == 'す'){
                return verb.substring(0, verb.length() - 1 ).concat("して");
            }
        }
        return verb;
    }
}
