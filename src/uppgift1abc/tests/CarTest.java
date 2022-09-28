package uppgift1abc.tests;
import org.junit.jupiter.api.Test;
import uppgift1abc.Car;
import uppgift1abc.CarOwner;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    // 1b svar:
    // Hade varit OK att ha access modifier PROTECTED på Car klassens attribut så slipper jag getCarOwner() för att kolla null

    @Test
    void testWhenCarSoldCarOwnerEqualsNull() {
        Car testCar = new Car("TST123", "TestCar", new CarOwner("Testare", "Testgatan", 20));
        testCar.carSold();

        assertNull(testCar.getCarOwner());  // Kommer att kolla om carOwner är null när man säljer bilen
    }

    @Test
    void testWhenSoldCarGetsNewOwnerNotEqualsNull(){
        Car testCar = new Car("TST123", "TestCar", new CarOwner("Testare", "Testgatan", 20));
        testCar.carSold();
        testCar.setCarOwner(new CarOwner("Bosse Testaren", "Testgatan 123", 18));

        assertNotNull(testCar.getCarOwner());
    }
}