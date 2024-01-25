package wth_station_pckg;

public class TestApp {

    public static void main(String[] args) {

        WeatherStation weatherStationObservable = new WeatherStation();
        NewMobileWeatherApp newSnd = new NewMobileWeatherApp();
        NewMobileWeatherApp newMobileWeatherApp = new NewMobileWeatherApp();
        newMobileWeatherApp.registerToWeatherService(weatherStationObservable);
        newSnd.registerToWeatherService(weatherStationObservable);
        weatherStationObservable.setSensorsStateChanged(27, 80, 1002);
    }
}
