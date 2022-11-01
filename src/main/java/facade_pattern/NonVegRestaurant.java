package facade_pattern;

public class NonVegRestaurant implements Hotel{
    @Override
    public void restaurant() {
        System.out.println("Non-Veg Restaurant");
    }
}
