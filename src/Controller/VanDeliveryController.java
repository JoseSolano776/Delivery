package Controller;

import Model.VanDelivery;


public class VanDeliveryController {
    VanDelivery[] vanDelivery = new VanDelivery[10];

    public VanDeliveryController() {
    }
    
    public void registrarVanDelivery(String trackingId, double distanceKm){
        VanDelivery newVanDelivery = new VanDelivery();
        newVanDelivery.setTrackingId(trackingId);
        newVanDelivery.setDistanceKm((int)distanceKm);
        
        for (int i = 0; i < vanDelivery.length; i++) {
            if(vanDelivery[i] == null){
                vanDelivery[i] = newVanDelivery;
                System.out.println("Insertado");
                i = vanDelivery.length - 1;
            }
        }
        
    }
    
    public double calcularTotalGeneral(){
        double calculo = 0;
        
        for (int i = 0; i < vanDelivery.length; i++) {
            if(vanDelivery[i] != null){
                calculo += vanDelivery[i].calculateCharge();
            }
        }
        
        return calculo;
    }
    
}
