public class OfficeWeather implements WeatherObserver,Display {

    private final WeatherStation station;

    public OfficeWeather(WeatherStation station) {
        this.station = station;
    }
    
    @Override
    public void displayWeather() {
        System.out.println("Displaying on Office...");
        String state = station.getWeather();
        System.out.println(state);
    }

    @Override
    public void update() {
        System.out.println("Office Weather updated...");
        String state = station.getWeather();
        System.out.println(state);
    }
}