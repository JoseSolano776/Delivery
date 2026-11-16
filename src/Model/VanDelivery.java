package Model;

public class VanDelivery extends Delivery{

    public VanDelivery() {
    }

    @Override
    protected int ratePerKm() {
        return 14;
    }
    
}
