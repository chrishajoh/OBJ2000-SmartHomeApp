package app;

import model.Light;
import model.SmartHomeApp;
import model.Thermostat;

public class SmartHomeTest4 {
    public static void main(String[] args) {
        SmartHomeApp app = new SmartHomeApp();

        // Legger til enheter
        app.addDevice(new Light("Kjøkken lampe", 50));
        app.addDevice(new Thermostat("Gang termostat", 22.1));
        app.addDevice(new Light("Stue lampe", 100));

        // Bruker metoder for å gjøre endringer på enhetene
        System.out.println("Utfører handliger...");
        app.turnOnDevice(0);
        app.setThermostatTemperature(1, 21.0);
        app.turnOffDevice(2);

        // Printer ut eventloggen
        System.out.println("\nEvent log");
        app.printLog();

        // Printer ut enheter før sortering
        System.out.println("\nEnheter før sorteing:");
        app.listDevices();

        // Printer ut data etter sortering
        System.out.println("\nEnheter etter sortering:");
        app.sortDevices();
        app.listDevices();
    }
}
