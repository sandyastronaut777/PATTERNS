package factory_pattern;

public class StormAlert implements Alert{
    @Override
    public void alertUser() {
        System.out.println("Be Aware! There's a Storm");
    }
}
