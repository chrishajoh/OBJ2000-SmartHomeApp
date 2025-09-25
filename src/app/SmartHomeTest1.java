package app;

import model.Light;
import model.SmartDevice;
import model.Thermostat;

import java.util.ArrayList;

public class SmartHomeTest1 {
    public static void main(String[] args) {
        ArrayList<SmartDevice> SmartDevice = new ArrayList<>();

        // Lager lampe og legger den i SmartDevice listen
        Light lampe = new Light("Lampe", 50);
        lampe.setBrightness(100);
        lampe.turnOn();
        SmartDevice.add(lampe);

        // Lager ovn og legger den i SmartDevice listen
        Thermostat ovn = new Thermostat("Ovn", 20.0);
        ovn.setTemperature(21);
        ovn.turnOn();
        SmartDevice.add(ovn);

        // Printer ut enhetene som ligger i arraylisten
        System.out.println("Slår på alle enheter");
        for (SmartDevice device : SmartDevice) {
            System.out.println(device);
        }

        // Printer ut enhetene som ligger i arrayliseten
        ovn.turnOff();
        lampe.turnOff();
        System.out.println("\nSlår av alle enheter");
        for (SmartDevice device : SmartDevice) {
            System.out.println(device);
        }
    }
}
