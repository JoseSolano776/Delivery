package Controller;

import Model.Packaging;

public class PackagingController {

    Packaging[] packagings = new Packaging[10];

    public PackagingController() {
    }

    public void registrarPackaging(int items, double chargePerItem) {
        Packaging newPackaging = new Packaging();
        newPackaging.setItems(items);
        newPackaging.setChargePerItem((int) chargePerItem);

        for (int i = 0; i < packagings.length; i++) {
            if (packagings[i] == null) {
                packagings[i] = newPackaging;
                i = packagings.length - 1;
            }

        }

    }

    public double calcularTotalGeneral() {
        double calculo = 0;

        for (int i = 0; i < packagings.length; i++) {
            if (packagings[i] != null) {
                calculo += packagings[i].calculateCharge();
            }
        }

        return calculo;
    }

}
