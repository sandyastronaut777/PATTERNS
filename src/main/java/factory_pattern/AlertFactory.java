package factory_pattern;

public class AlertFactory {
     Alert createAlert(String message) {
        if (message == null || message.isEmpty())
            return null;
        switch (message) {
            case "Fire":
                return new FireAlert();
            case "Storm":
                return new StormAlert();
            case "Flood":
                return new FloodAlert();
            default:
                throw new IllegalArgumentException("Unknown message"+message);

        }
    }
}
