public abstract class AddOnDecorator extends Beverage {
    protected Beverage beverage;

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost();
    }

    @Override 
    public String getDescription() {
        return this.beverage.getDescription();
    }
}
