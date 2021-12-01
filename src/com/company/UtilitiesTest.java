package com.company;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {
    private Utilities utilities;

    @BeforeEach
    public void setup(){
        utilities = new Utilities();
    }

    @org.junit.jupiter.api.Test
    void everyNthChar() {
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] secondOutput = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 6);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, secondOutput);
    }

    @org.junit.jupiter.api.Test
    void removePairs() {
        // AABCDDEFF -> ABCDEF
       assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        // ABCCABDEEF -> ABCABDEF
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        // Null => Null
        assertNull(null, utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @org.junit.jupiter.api.Test
    void converter() {
        assertEquals(300,utilities.converter(10, 5));
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}