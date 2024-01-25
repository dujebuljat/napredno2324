package wth_station_pckg;

public interface WeatherStationRegistration extends ObserverInt{

    void registerToWeatherService(WeatherStationObservable wso);
    void unregisterFromWeatherService(WeatherStationObservable wso);
}
