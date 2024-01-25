package wth_station_pckg;

public class NewMobileWeatherApp implements WeatherStationRegistration, Display {

    private float temp;
    private float hum;
    private float press;

    public NewMobileWeatherApp() {

    }

    @Override
    public void update(float temp, float hum, float press) {
        this.temp = temp;
        this.hum = hum;
        this.press = press;
    }

    @Override
    public void registerToWeatherService(WeatherStationObservable wso) {
        wso.addObserver(this);
    }

    @Override
    public void unregisterFromWeatherService(WeatherStationObservable wso) {
        wso.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temp: " + temp + " Hum: " + hum + " Press: " + press);
    }
}
