import deals.Deal;
import taxes.TaxSystem;


public class Company {
    private String title;
    private static int debit;
    private static int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public static void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Kомпания %s уплатила налог в размере: %d руб.\n", title, tax);
        debit = 0;
        credit = 0;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }


    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            if (deal.getDebitChange() != 0) {
                shiftMoney(deal.getDebitChange());
            }
            if (deal.getCreditChange() != 0) {
                shiftMoney(deal.getCreditChange());
            }
        }
        int balance = debit - credit;
        payTaxes();
        if (balance > 0) {
            System.out.print("Доходов больше на: ");
            return balance;
        } else {
            System.out.print("Расходов больше на: ");
            return Math.abs(balance);
        }
    }
}
