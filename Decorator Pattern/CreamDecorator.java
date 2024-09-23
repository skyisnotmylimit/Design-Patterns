public class CreamDecorator extends AddOnDecorator {
    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double getCost() {
        return this.beverage.getCost() + 8.00;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " ,Cream";
    }
}
