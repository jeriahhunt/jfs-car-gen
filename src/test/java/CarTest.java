import car_gen.Honda;
import car_gen.Lexus;
import car_gen.Toyota;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarTest {
    Honda civic = new Honda("red", 2013, 50, true, false);
    Toyota supra = new Toyota("blue", 2013, 76, true, false);
    Lexus rx350 = new Lexus("yellow", 2013, 86, true, false);

    @Test
    public void testGetColor() {
        assertEquals("red", civic.getColor());

    }

    @Test
    public void testGetYear() {
        assertEquals(2013, civic.getYear());
    }

    @Test
    public void testGetMaxSpeed() {
        assertEquals(50, civic.getMaxSpeed());
    }

    @Test
    public void testisElectric() {
        assertTrue(civic.isElectric());
    }

    @Test
    public void testisTurboCharged() {
        assertFalse(civic.isTurboCharged());
    }

    @Test
    public void testhasLeatherSeats() {
        assertFalse(rx350.isHasLeatherSeats());
    }

    @Test
    public void testisGreatGasMileage() {
        assertFalse(supra.isGreatGasMileage());
    }

    @Test
    public void accelerateSpeed() {
        assertEquals(0, civic.getSpeed());
        assertEquals(5, civic.accelerateSpeed());
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        civic.accelerateSpeed();
        assertEquals(50, civic.getSpeed());
        assertEquals(50, civic.accelerateSpeed());

    }
    @Test
    public void decelerateSpeed() {
        civic.accelerateSpeed();
        civic.accelerateSpeed();

        assertEquals(10, civic.getSpeed());
        assertEquals(5, civic.decelerateSpeed());

        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();
        civic.decelerateSpeed();

        assertEquals(0, civic.getSpeed());
        assertEquals(0, civic.decelerateSpeed());
    };

    @Test
    public void testSetColor() {
        civic.setColor("green");
        assertEquals("green", civic.getColor());

    }

    @Test
    public void testSetYear() {
        civic.setYear(2015);
        assertEquals(2015, civic.getYear());

    }

    @Test
    public void testSetMaxSpeed() {
        civic.setMaxSpeed(86);
        assertEquals(86, civic.getMaxSpeed());

    }

    @Test
    public void testSetElectric() {
        civic.setElectric(false);
        assertEquals(false, civic.isElectric());
    }

    @Test
    public void testSetTurboCharged() {
        civic.setTurboCharged(false);
        assertEquals(false, civic.isTurboCharged());

    }

    @Test
    public void testSethasLeatherSeats() {
        rx350.setHasLeatherSeats(false);
        assertEquals(false, rx350.isHasLeatherSeats());

    }

    @Test
    public void testSetGreatGasMileage() {
        supra.setGreatGasMileage(false);
        assertEquals(false, supra.isGreatGasMileage());

    }



}
