package Model;

public class Packaging implements Chargeable {

    private int items = 3;
    private int chargePerItem = 25;

    public Packaging() {}

    public Packaging(int items, int chargePerItem) {
        this.items = items;
        this.chargePerItem = chargePerItem;
    }

    @Override
    public String label() {
        return "Empaque del pedido";
    }

    @Override
    public int calculateCharge() {
        return items * chargePerItem;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public int getChargePerItem() {
        return chargePerItem;
    }

    public void setChargePerItem(int chargePerItem) {
        this.chargePerItem = chargePerItem;
    }

}
