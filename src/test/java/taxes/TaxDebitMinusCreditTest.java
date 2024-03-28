package taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxDebitMinusCreditTest {

    @Test
    void testCalcDebitMinusCredit() {
        int debit = 1000;
        int credit = 100;
        int taxDebitMinusCredit = (debit-credit) * 15/100;
        Assertions.assertEquals(135, taxDebitMinusCredit);
    }
}