public class ChocolateDecorator extends AddOnDecorator {
    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double getCost() {
        return this.beverage.getCost() + 10.00;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " ,Chocolate";
    }
}
