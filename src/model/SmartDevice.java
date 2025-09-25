package model;

public abstract class SmartDevice implements Comparable<SmartDevice> {
    protected String name;
    protected boolean isOn;

    // Konstruktør
    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    // Skrur på en enhet
    public void turnOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    // Skrur av en enhet
    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
    }

    // Sammenlgner navn og ser bort ifra stor og liten bokstav
    @Override
    public int compareTo(SmartDevice other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    // Printer data til en String
    public String toString() {
        return "Smart Devices " + "[" +
                "Name=" + name + ", " +
                "Stauts=" + (isOn ? "ON" : "OFF") + "]"; // Sjekker om isOn = sann eller usann (ternary operator)
    }
}
