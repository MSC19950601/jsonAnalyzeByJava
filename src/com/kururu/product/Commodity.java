package com.kururu.product;

/**
 * Created by Ellery Queen on 2016/3/4.
 */
public class Commodity {

    private String itemName;
    private String itemId;
    private boolean isWeigh;
    private double unitPrice;
    private int number;
    private double totalPrice;

    public Commodity(){}

    public Commodity(Item item){
        this.itemName = item.getItemName();
        this.itemId = item.toString();
        this.isWeigh = item.isWeigh();
        this.unitPrice = item.getUnitPrice();
    }


    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isWeigh() {
        return isWeigh;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return itemName + " " +itemId;
    }

    public static void main(String[] args) {
        Commodity commodity = new Commodity(Item.ITEM000001);
        System.out.println(commodity.toString());

    }
}
