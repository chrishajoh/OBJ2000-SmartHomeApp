package model;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String name) {
        super(name);
    }

    @Override
    public double readValue() {
        return 20; // Fast verdi
    }

    @Override
    public String toString() {
        return "TemperatureSensor " + "[" + "Name=" + name + ", " + "Temperature=" + readValue();
    }
}
