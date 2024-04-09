package CreationalPatterns.DecoNew;

public class MilkCoffee extends CoffeeDecorator {

    protected MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + withMilk();
    }

    private int withMilk() {
        return 5000;
    }
}
