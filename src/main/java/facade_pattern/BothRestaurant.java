package facade_pattern;

public class BothRestaurant implements Hotel{
    @Override
    public void restaurant() {
        System.out.println("Veg and Non-Veg Restaurant");
    }
}
