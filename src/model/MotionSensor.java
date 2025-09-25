package model;

public class MotionSensor extends Sensor {

    // Konstruktør
    public MotionSensor(String name) {
        super(name);
    }

    // En sjekk for å se om det har vært en bevegelse
    @Override
    public double readValue() {
        return 0;
    }

    // Printer en String av data for sensor
    @Override
    public String toString() {
        return "MotionSensor " + "[" + "Name=" + name + ", " + (readValue() == 1.0 ? "bevergelse oppdaget" : "ingen bevegelse opddaget");
    }
}
