package factory_pattern;

public class FireAlert implements Alert{
    @Override
    public void alertUser() {
        System.out.println("Be Aware! There's a Fire");
    }
}
