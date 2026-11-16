package Model;

abstract class Delivery implements Chargeable{
    private String trackingId;
    private int distanceKm;
    private int trackingInt;
    
    public int baseCharge(){
        return 40;
    }
    
    protected abstract int ratePerKm();

    @Override
    public String label() {
        return "Envio a domicilio";
    }

    @Override
    public int calculateCharge() {
        return baseCharge() + distanceKm * ratePerKm();
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public int getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }    
    
    public void generateAutomaticTrackingId(){
        trackingInt++;
    }
    
}
