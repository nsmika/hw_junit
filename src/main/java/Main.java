import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;


public class Main {
    public static void main(String[] args) {
        Company company = new Company("Netology", new TaxDebit());
        company.shiftMoney(100);
        company.shiftMoney(-50);
        company.payTaxes();

        company.setTaxSystem(new TaxDebitMinusCredit());
        company.shiftMoney(100);
        company.shiftMoney(-50);
        company.payTaxes();

        company.setTaxSystem(new TaxDebit());
        System.out.println(company.applyDeals(new Deal[]{
                new Sale("Курсы Java+", 600),
                new Expenditure("Всячина", -300),
                new Sale("Курсы Java", 400),
        }));
        company.setTaxSystem(new TaxDebitMinusCredit());
        System.out.println(company.applyDeals(new Deal[]{
                new Sale("Курсы Java+", 600),
                new Expenditure("Всячина", -3000),
                new Sale("Курсы Java", 400),
        }));
    }
}