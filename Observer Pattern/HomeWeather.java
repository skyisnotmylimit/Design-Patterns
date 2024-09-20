public class HomeWeather implements WeatherObserver,Display {
    private final WeatherStation station;

    public HomeWeather(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void displayWeather() {
        System.out.println("Displaying on Home...");
        String state = station.getWeather();
        System.out.println(state);
    }

    @Override
    public void update() {
        System.out.println("Home Weather updated...");
        String state = station.getWeather();
        System.out.println(state);
    }
}
