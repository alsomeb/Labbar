package uppgift9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanLettersTest {
    // I, V, X, L, C, D och M som står för 1, 5, 10, 50, 100,500 resp. 1000.

    @Test
    void testRomanLetterIReturnsCorrectIntegerValue() {
        int expected = 1;
        assertEquals(expected, RomanLetters.I.getIntValue());
    }

    @Test
    void testRomanLetterVReturnsCorrectIntegerValue() {
        int expected = 5;
        assertEquals(expected, RomanLetters.V.getIntValue());
    }

    @Test
    void testRomanLetterXReturnsCorrectIntegerValue() {
        int expected = 10;
        assertEquals(expected, RomanLetters.X.getIntValue());
    }

    @Test
    void testRomanLetterLReturnsCorrectIntegerValue() {
        int expected = 50;
        assertEquals(expected, RomanLetters.L.getIntValue());
    }

    @Test
    void testRomanLetterCReturnsCorrectIntegerValue() {
        int expected = 100;
        assertEquals(expected, RomanLetters.C.getIntValue());
    }

    @Test
    void testRomanLetterDReturnsCorrectIntegerValue() {
        int expected = 500;
        assertEquals(expected, RomanLetters.D.getIntValue());
    }

    @Test
    void testRomanLetterMReturnsCorrectIntegerValue() {
        int expected = 1000;
        assertEquals(expected, RomanLetters.M.getIntValue());
    }


}