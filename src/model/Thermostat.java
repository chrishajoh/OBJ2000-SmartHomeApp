package model;

public class Thermostat extends SmartDevice implements Schedulable {
    private double temperature;

    // Konstruktør
    public Thermostat(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    // Setter en temperatur
    public void setTemperature(double t) {
        this.temperature = t;
    }

    // Planlegger tidspunkt for når en enhet skal skrus på
    @Override
    public void schedule(String timeSpec) {

    }

    // Skriver ut data i en String
    @Override
    public String toString() {
        return "Thermostat " + "[" + "Name=" + name + ", " +
                "Status=" + (isOn ? "ON" : "OFF") + ", " + // Sjekker om isOn = sann eller usann
                "Temperatur=" + temperature + "]";
    }
}
