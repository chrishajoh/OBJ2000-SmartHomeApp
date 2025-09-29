package app;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeTest2 {
    public static void main(String[] args) {
        List<Schedulable> schedulables = new ArrayList<>();
        List<Sensor> sensors = new ArrayList<>();

        System.out.println("Planlegger enheter...");
        // Lager enhetene og legger dem til i schedulabes
        Light lampe = new Light("Lampe", 100);
        Thermostat gang = new Thermostat("Gang thermostat", 20.0);
        schedulables.add(lampe);
        schedulables.add(gang);

        // Lister ut enhetene som er planlagt
        for (Schedulable s : schedulables) {
            String time = "07:00";
            s.schedule(time);
            System.out.println(s + " er planlagt til kl. " + time);
        }
        
        System.out.println("\nLeser av sensorer...");
        // Oppretter temperatur og legger til i sensor
        TemperatureSensor inneTemp = new TemperatureSensor("Inne tmep");
        MotionSensor mtStue = new MotionSensor("Bevegelse stue");
        sensors.add(inneTemp);
        sensors.add(mtStue);

        //Lister ut data som ligger i sensor
        for (Sensor sensor : sensors) {
            sensor.readValue();
            System.out.println(sensor);
        }
    }
}
