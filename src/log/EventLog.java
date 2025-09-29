package log;

import java.util.ArrayList;

public class EventLog {
    final private ArrayList<String> eventLogs = new ArrayList<>();

    // Legger til log i en ArrayList
    public void addLog(String message) {
        eventLogs.add(message);
    }

    // Printer ut log'en som ligger i EventListen
    public void printLog() {
        for (int i = 0; i < eventLogs.size(); i++) {
            System.out.println("[ [" + i + "]" + eventLogs + " ]");
        }
    }

}
