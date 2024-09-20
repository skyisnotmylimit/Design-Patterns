public class Main {
    public static void main(String args[]) {
        WeatherStation ws = new WeatherStation();
        WeatherState state = new WeatherState();
        SchoolWeather sw = new SchoolWeather(ws);
        HomeWeather hw = new HomeWeather(ws);
        OfficeWeather ow = new OfficeWeather(ws);
        sw.displayWeather();
        hw.displayWeather();
        ow.displayWeather();
        ws.addObserver(sw);
        ws.addObserver(hw);
        ws.addObserver(ow);
        state.setWeatherState(59,20,300);
        ws.setWeather(state);
        state.setWeatherState(30, 50, 158);
        ws.setWeather(state);
    }
}
