package taxes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxDebitTest {

    @Test
    void testCalcDebit() {
        int debit = 100;
        int taxDebit = debit * 6/100;
        Assertions.assertEquals(6, taxDebit);
    }
}