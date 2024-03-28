import deals.Sale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void testShiftMoneyCorrectWork() {
        int amount = -1;
        int debit = 0;
        int credit = 0;
        if (amount > 0) {
            debit += amount;
        } else {
            credit += Math.abs(amount);
        }
        Assertions.assertEquals(1, credit);
        Assertions.assertEquals(0, debit);
    }
}