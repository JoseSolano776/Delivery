package Controller;

import Model.BikeDelivery;


public class BikeDeliveryController {
    
    BikeDelivery[] bikersDelivery = new BikeDelivery[10];

    public BikeDeliveryController() {
    }
    
    public void registrarBikeDelivery(String trackingId, double distanceKm){
        BikeDelivery newBikeDelivery = new BikeDelivery();
        newBikeDelivery.setTrackingId(trackingId);
        newBikeDelivery.setDistanceKm((int)distanceKm);
        
        for (int i = 0; i < bikersDelivery.length; i++) {
            if(bikersDelivery[i] == null){
                bikersDelivery[i] = newBikeDelivery;
                i = bikersDelivery.length - 1;
            }
        }
        
    }
    
    public double calcularTotalGeneral(){
        double calculo = 0;
        
        for (int i = 0; i < bikersDelivery.length; i++) {
            if(bikersDelivery[i] != null){
                calculo += bikersDelivery[i].calculateCharge();
            }
        }
        
        return calculo;
    }
    
}
