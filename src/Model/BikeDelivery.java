package Model;

public class BikeDelivery extends Delivery{

    public BikeDelivery() {
    }
    
    @Override
    protected int ratePerKm() {
        return 8;
    }
    
}
