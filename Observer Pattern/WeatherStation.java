import java.util.HashSet;

public class WeatherStation implements WeatherObservable {
    private final HashSet<WeatherObserver> observerList;
    private WeatherState ws;

    public WeatherStation() {
        observerList = new HashSet<>();
        ws = new WeatherState();
    }

    @Override
    public void addObserver(WeatherObserver wb) {
        observerList.add(wb);
    }

    @Override
    public void removeObserver(WeatherObserver wb) {
        observerList.remove(wb);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver wb : observerList) {
            wb.update();
        }
    }

    public void setWeather(WeatherState newState) {
        this.ws = newState;
        notifyObservers();
    }

    public String getWeather() {
        String state = ws.getWeatherState();
        return state;
    }
}
