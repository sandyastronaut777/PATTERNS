package factory_pattern;

public class AlertService {
    public static void main(String[] args) {
        AlertFactory alertFactory= new AlertFactory();
        Alert alert = alertFactory.createAlert("Storm");
        alert.alertUser();
        }
    }

