package facade_pattern;

public class HotelFacade {
    private Hotel veg;
    private Hotel non_veg;
    private Hotel both;

    public HotelFacade() {
        veg = new VegRestaurant();
        non_veg = new NonVegRestaurant();
        both = new BothRestaurant();
    }

    public void vegRestaurant() {
        veg.restaurant();
    }

    public void non_vegRestaurant() {
        non_veg.restaurant();
    }

    public void bothRestaurant() {
        both.restaurant();
    }
}
