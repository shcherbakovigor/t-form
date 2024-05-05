package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeFormConvertorTest {

    @Test
    void firstConjugation() {
        assertEquals("たって", TeFormConvertor.convert("たつ"));
        assertEquals("たって", TeFormConvertor.convert("たつ"));
        assertEquals("とって", TeFormConvertor.convert("とる"));

        assertEquals("しんで", TeFormConvertor.convert("しぬ"));
        assertEquals("あそんで", TeFormConvertor.convert("あそぬ"));
        assertEquals("のんで", TeFormConvertor.convert("のむ"));

        assertEquals("かいて", TeFormConvertor.convert("かく"));
        assertEquals("およいで", TeFormConvertor.convert("およぐ"));
    }

    @Test
    void secondConjugation() {
        assertEquals("あびて", TeFormConvertor.convert("あびる"));
        assertEquals("でて", TeFormConvertor.convert("でる"));
    }

    @Test
    void thirdConjugation() {
        assertEquals("して", TeFormConvertor.convert("する"));
        assertEquals("きて", TeFormConvertor.convert("くる"));
    }
}