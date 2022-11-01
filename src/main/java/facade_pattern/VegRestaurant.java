package facade_pattern;

public class VegRestaurant implements Hotel{
    @Override
    public void restaurant() {
        System.out.println("Veg-Restaurant");
    }
}
