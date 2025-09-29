package model;

import java.util.ArrayList;

public class MyPhone {
    private final String phoneName;
    private final ArrayList<App> apps = new ArrayList<>();

    // Konstruktør
    public MyPhone(String phoneName) {
        this.phoneName = phoneName;
    }

    // Installerer en app
    public void installApp(App app) {
        apps.add(app);
        System.out.println("Installerer " + app.getName() + " på telefonen...");
    }

    // Kjører en app utifra navnet på appen
    public void runApp(String appName) {
        for (App app : apps) {
            if (app.getName().equals(appName)) {
                app.run();
                return;
            }
        }
        System.out.println("App " + appName + " ble ikke funnet!");
    }

    // Printer ut data til en String
    @Override
    public String toString() {
        return "MyPhone [" + "Mobilnavn=" + phoneName + "]";
    }

}
