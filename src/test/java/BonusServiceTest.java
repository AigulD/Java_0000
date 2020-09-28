import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shoudlCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }

    @Test
    void shoudlCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }

    @Test
    void shoudlCalculateForNonRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 15;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }

    @Test
    void shoudlCalculateForNonRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
    }
}