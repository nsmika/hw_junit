package deals;

public class Sale extends Deal {
    public Sale(String good, int price) {
        super(String.format("Продажа %s на %d руб.", good, price),
                0,
                price);
        System.out.println(getComment());
    }
}
