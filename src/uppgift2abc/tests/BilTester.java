package uppgift2abc.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uppgift2abc.Bil;

class BilTester {

    Bil testcar = new Bil(50, 3500, 6, 1);

    @Test
    void testWhenChangingGearUpAddsOneToCurrentGear() {
        testcar.växlaUpp();
        int actual = testcar.getVäxelJustNu();
        assertEquals(2, actual);
    }

    @Test
    void testWhenChangingGearDownWhilstOnGear1StaysOnGear1() {
        testcar.växlaNer();
        int actual = testcar.getVäxelJustNu();
        assertEquals(1, actual);
    }

    @Test
    void testWhenChangingGearDownAndNotOnGear1SubtractsOneToCurrentGear() {
        testcar.setVäxelJustNu(2);
        testcar.växlaNer();
        int actual = testcar.getVäxelJustNu();
        assertEquals(1, actual);
    }


}