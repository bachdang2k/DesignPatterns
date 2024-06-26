package structuralPatterns.DecoNew;

public abstract class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
}
