package structuralPatterns.DecoNew;

public class IceCream extends CoffeeDecorator {
    public IceCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + withIceCream();
    }

    private int withIceCream() {
        return 5000;
    }
}
