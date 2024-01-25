package wth_station_pckg;

public class WeatherStation extends WeatherStationObservable{

    private int id;
    private static int cntID = 10;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.id = cntID++;
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }

    @Override
    protected void addObserver(ObserverInt observer) {
        System.out.println("Adding observer to notification list: " + observer);
        observers.add(observer);
    }

    @Override
    protected void removeObserver(ObserverInt observer) {
        if (observers.contains(observer)) {
            System.out.println("Removing observer: " + observer);
            observers.remove(observer);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setSensorsStateChanged(float temp, float hum, float press) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        System.out.println("Sensors state changed...");
        notifyObservers();
    }

    @Override
    public void notifyObservers() {

        for(ObserverInt observer : observers) {
            System.out.println(observer);
            observer.update(temperature, humidity, pressure);
        }

    }
}
