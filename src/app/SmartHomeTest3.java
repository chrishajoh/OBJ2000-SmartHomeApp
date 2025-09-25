package app;

import model.*;

public class SmartHomeTest3 {
    public static void main(String[] args) {
        // Lager telefonen og legger til appen
        MyPhone phone = new MyPhone("MyPohne");
        SmartHomeApp app = new SmartHomeApp();

        // Installerer appen på telefonen
        phone.installApp(app);
        phone.runApp("SmartHomeApp");

        System.out.println();
        // Legger til enheter i appen
        app.addDevice(new Light("Stue lampe", 0));
        app.addDevice(new Thermostat("Gang termostat", 20));
        app.listDevices();

        System.out.println();
        // Funksjoner for enhetene
        app.turnOnDevice(0);
        app.turnOnDevice(1);
        app.listDevices();
        
        // Oppdatering av data i appen
        System.out.println("\nSetter spesialfunksjoner...");
        app.setLightBrightness(0, 100);
        app.setThermostatTemperature(1, 22.3);

        System.out.println();
        app.listDevices();
    }
}
