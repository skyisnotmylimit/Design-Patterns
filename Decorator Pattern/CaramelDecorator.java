public class CaramelDecorator extends AddOnDecorator {

    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 10.00;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " ,Caramel";
    }
}
