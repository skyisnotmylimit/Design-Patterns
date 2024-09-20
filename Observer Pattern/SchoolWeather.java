public class SchoolWeather implements WeatherObserver,Display {

    private final WeatherStation station;

    public SchoolWeather(WeatherStation station) {
        this.station = station;
    }
    
    @Override
    public void displayWeather() {
        System.out.println("Displaying on School...");
        String state = station.getWeather();
        System.out.println(state);
    }

    @Override
    public void update() {
        System.out.println("School Weather updated...");
        String state = station.getWeather();
        System.out.println(state);
    }
}