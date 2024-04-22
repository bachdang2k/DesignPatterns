package structuralPatterns.DecoNew;

//concreteComponent
public class DefaultCoffeeImpl implements Coffee {
    @Override
    public int getPrice() {
        return 5000;
    }
}
