package model;

public abstract class Sensor extends SmartDevice {

    // Konstruktør, fra superklassen
    public Sensor(String name) {
        super(name);
    }

    // Sjekker om e sensor blir utløst eller ikke
    public abstract double readValue();

    // Printer data til en String
    @Override
    public String toString() {
        return "Sensor" + "[" + "Name=" + name + ", " + readValue() + "]";
    }
}
