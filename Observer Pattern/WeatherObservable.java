interface WeatherObservable {
    void addObserver(WeatherObserver wb);
    void removeObserver(WeatherObserver wb);
    void notifyObservers();
}