package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConjugationDefinerTest {

    List<String> firstConjugationSamples = List.of(
            "あう",
            "あそぶ",
            "ある",
            "あるく",
            "いう",
            "いく",
            "いそぐ",
            "うたう",
            "うる",
            "おくる",
            "おもう",
            "およぐ",
            "おわる",
            "かう",
            "かえる",
            "かえす",
            "かかる",
            "かく",
            "かす",
            "がんばる",
            "きく",
            "きる",
            "けす",
            "しる",
            "すう",
            "すむ",
            "すわる",
            "だす",
            "たつ",
            "つかう",
            "つくる",
            "とる",
            "なくす",
            "ならう",
            "なる",
            "のむ",
            "のる",
            "はいる",
            "はく",
            "はなす",
            "はらう",
            "はたらく",
            "ひく",
            "ふる",
            "まつ",
            "まがる",
            "もつ",
            "もらう",
            "やすむ",
            "よむ",
            "わかる"
    );

    List<String> secondConjugationSamples = List.of(
            "あげる",
            "あける",
            "あびる",
            "いれる",
            "いる",
            "おしえる",
            "おぼえる",
            "おりる",
            "かける",
            "かりる",
            "かんがえる",
            "くれる",
            "しめる",
            "たべる",
            "つける",
            "でる",
            "ねる",
            "のりかえる",
            "はじめる",
            "みせる",
            "みる",
            "やめる",
            "わすれる"
    );

    @Test
    void defineFirstConjugation() {
        for (String firstConjugationSample : firstConjugationSamples) {
            assertEquals(
                    Conjugation.FIRST,
                    ConjugationDefiner.defineConjugation(firstConjugationSample),
                    firstConjugationSample
            );
        }
    }

    @Test
    void defineSecondConjugation() {
        for (String secondConjugationSample : secondConjugationSamples) {
            assertEquals(
                    Conjugation.SECOND,
                    ConjugationDefiner.defineConjugation(secondConjugationSample),
                    secondConjugationSample
            );
        }
        assertEquals(Conjugation.SECOND, ConjugationDefiner.defineConjugation("あげる"));
        assertEquals(Conjugation.SECOND, ConjugationDefiner.defineConjugation("あける"));
        assertNotEquals(Conjugation.SECOND, ConjugationDefiner.defineConjugation("ある"));
        assertEquals(Conjugation.SECOND, ConjugationDefiner.defineConjugation("あびる"));

    }

    @Test
    void defineThirdConjugation() {
        assertEquals(Conjugation.THIRD, ConjugationDefiner.defineConjugation("する"));
        assertEquals(Conjugation.THIRD, ConjugationDefiner.defineConjugation("くる"));
    }
}