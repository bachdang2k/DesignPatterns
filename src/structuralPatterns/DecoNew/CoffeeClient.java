package structuralPatterns.DecoNew;

public class CoffeeClient {

    public static void main(String[] args) {

        Coffee milkCoffee = new MilkCoffee(new DefaultCoffeeImpl());

        Coffee fullCoffee = new MilkCoffee(new IceCream(new DefaultCoffeeImpl()));

        System.out.println("milkCoffee = " + milkCoffee.getPrice());
        System.out.println("fullCoffee = " + fullCoffee.getPrice());

    }
}
