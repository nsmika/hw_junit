package deals;

public class Expenditure extends Deal {
    public Expenditure(String good, int price) {
        super(String.format("Покупка %s на %d руб.", good, price),
                price,
                0);
        System.out.println(getComment());
    }
}
