package wth_station_pckg;

public class MobileWeatherAppObserver implements ObserverInt, Display{

    private float temperature;
    private float humidity;
    private float pressure;
    private int cnt;

    private WeatherStationObservable weatherStationObservable;

    public MobileWeatherAppObserver(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
        weatherStationObservable.addObserver(this);
        cnt = 1;
    }

    @Override
    public void display() {
        System.out.println("Temp: " + temperature + " Hum: " + humidity + " Press: " + pressure);
    }

    @Override
    public void update(float temp, float hum, float press) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        System.out.println("Weather parameters changed...");
        display();
        System.out.println("--------------------------------------------------------");
        if (cnt % 100 == 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Some method triggered...");
        weatherStationObservable.notifyObservers();

    }
}
