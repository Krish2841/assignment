package PatternExercise;
interface Coffee {
    String getDescription();
    double getCost();
}

class BasicCoffee implements Coffee {
    public String getDescription() { return "Basic Coffee"; }
    public double getCost() { return 50; }
}

class MilkDecorator implements Coffee {
    Coffee coffee;

    MilkDecorator(Coffee coffee) { this.coffee = coffee; }

    public String getDescription() { return coffee.getDescription() + ", Milk"; }
    public double getCost() { return coffee.getCost() + 20; }
}

class SugarDecorator implements Coffee {
    Coffee coffee;

    SugarDecorator(Coffee coffee) { this.coffee = coffee; }

    public String getDescription() { return coffee.getDescription() + ", Sugar"; }
    public double getCost() { return coffee.getCost() + 10; }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription() + " | Cost: " + coffee.getCost());
    }
}
