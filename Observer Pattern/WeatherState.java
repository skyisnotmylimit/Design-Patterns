public class WeatherState {
    private int temperature;
    private int humidity;
    private int aqi;

    public WeatherState() {
        this.temperature = 0;
        this.humidity = 0;
        this.aqi = 0;
    }

    public void setWeatherState(int temperature,int humidity,int aqi) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.aqi = aqi;
    }

    public String getWeatherState() {
        String state = "";
        state = (state + temperature + ", " + humidity + ", " + aqi);
        return state;
    }
}
