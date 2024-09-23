public class Main {
    public static void main(String[] args) {
        Beverage espresso = new EspressoBeverage();
        System.out.println(espresso.getDescription());
        System.out.println(espresso.getCost());

        Beverage tea = new TeaBeverage();
        System.out.println(tea.getDescription());
        System.out.println(tea.getCost());

        espresso = new CaramelDecorator(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.getCost());
        
        tea = new ChocolateDecorator(tea);
        System.out.println(tea.getDescription());
        System.out.println(tea.getCost());
    }
}
