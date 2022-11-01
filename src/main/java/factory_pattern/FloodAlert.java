package factory_pattern;

public class FloodAlert implements Alert{
    @Override
    public void alertUser() {
        System.out.println("Be Aware! There's a Flood");
    }
}
