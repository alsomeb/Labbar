package uppgift2ab.tests;

import org.junit.jupiter.api.Test;
import uppgift2ab.Tåg;

import static org.junit.jupiter.api.Assertions.*;

class TågTest {

    Tåg test = new Tåg(200, 50000, 1);
    Tåg test2 = new Tåg(200, 50000);

    @Test
    void testKopplaVagnAddsOneToAntalVagnar() {
        test.kopplaVagn();
        int actual = test.getAntalVagnar();
        assertEquals(2, actual);
    }

    @Test
    void testKopplaVagnAddsOneToAntalVagnarWithoutAntalVagnarParameterConstructor() {
        test2.kopplaVagn();
        int actual = test.getAntalVagnar();
        assertEquals(1, actual);
    }
}