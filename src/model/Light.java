package model;

public class Light extends SmartDevice implements Schedulable {
    private int brightness;

    // Konstruktør for klassen
    public Light(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    // Funksjon for å endre lysstyrken
    public void setBrightness(int level) {
        if (level >= 0 && level <= 100) {
            this.brightness = level;
        } else System.out.println("Brightness er ikke innenfor 0-100!");
    }

    // Planlegger ett klokkeslett for enheten
    @Override
    public void schedule(String timeSpec) {
    }

    // Printer ut lys data i en string
    @Override
    public String toString() {
        return "Light " + "[" + "Name=" + name + ", " +
                "Status=" + (isOn ? "ON" : "OFF") + ", " + // Sjekker om isOn = sann eller usann
                "Brightness=" + brightness + "]";
    }


}
