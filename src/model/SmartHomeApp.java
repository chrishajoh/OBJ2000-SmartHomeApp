package model;

import log.EventLog;

import java.util.ArrayList;
import java.util.Collections;

public class SmartHomeApp implements App {
    private final ArrayList<SmartDevice> devices = new ArrayList<>();
    private final EventLog eventLog = new EventLog();

    // Henter navn på en app
    @Override
    public String getName() {
        return "SmartHomeApp";
    }

    // Kjører en app
    @Override
    public void run() {

    }

    // Legger til en enhet i SmartDevice
    public void addDevice(SmartDevice d) {
        devices.add(d);
    }

    // Skriver ut en liste av alle enhetene
    public void listDevices() {
        for (int i = 0; i < devices.size(); i++) {
            System.out.println(i + ": " + devices.get(i));
        }
    }

    // Skrur på en enhet basert på index
    public void turnOnDevice(int index) {
        if (index >= 0 && index < devices.size()) {
            SmartDevice d = devices.get(index);
            d.turnOn();
            eventLog.addLog("Enhet ble skrudd på: " + devices.get(index));
            System.out.println("[" + index + "] " + d.name + " slått på");
        } else System.out.println("Ugyldig index!");
    }

    // Skrur av en enhet basert på index
    public void turnOffDevice(int index) {
        if (index >= 0 && index < devices.size()) {
            SmartDevice d = devices.get(index);
            d.turnOff();
            eventLog.addLog("Enhet ble skrudd av: " + devices.get(index));
            System.out.println("[" + index + "] " + d.name + " slått av");
        } else System.out.println("Ugyldig index!");
    }

    // Endrer på lysstyrken på en enhet
    public void setLightBrightness(int index, int level) {
        // Sjekker om index tilhører en instanceof Light
        if (index >= 0 && index < devices.size() && devices.get(index) instanceof Light light) {
            // Light light = (Light) devices.get(index); Kan skrives som Light light som vist over
            light.setBrightness(level);
            eventLog.addLog("Endret lysstyrke på index: " + devices.get(index) + " til: " + level);
            System.out.println("Light [" + light.name + ", " + "brightness=" + level + "]");
        }
    }

    // Endrer på termostaten på en enhet
    public void setThermostatTemperature(int index, double t) {
        // Sjekker om index tilhører en instanceof Thermostat
        if (index >= 0 && index < devices.size() && devices.get(index) instanceof Thermostat thermostat) {
            thermostat.setTemperature(t);
            eventLog.addLog("Endret temperatur på index: " + devices.get(index) + " til " + t);
            System.out.println("[" + index + "] " + "Thermostat [" + thermostat.name + ", " + "temperature=" + t + "]");
        }
    }

    // Sorterer enheter basert på navn
    public void sortDevices() {
        Collections.sort(devices);
    }

    // Skriver ut en log av eventLog
    public void printLog() {
        eventLog.printLog();
    }

}
