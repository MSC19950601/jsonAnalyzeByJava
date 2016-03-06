package com.kururu.product;

/**
 * Created by Ellery Queen on 2016/3/4.
 */
public enum Item {

    ITEM000001("badminto",false,1.00),
    ITEM000002("cpp_primer_5th",false,118.00),
    ITEM000003("apple",true,5.50),
    ITEM000004("banana",true,4.50),
    ITEM000005("cola",false,3.00);

    private String itemName;
    private boolean isWeigh;
    private double unitPrice;

    Item(String itemName,boolean isWeigh,double unitPrice){
        this.itemName = itemName;
        this.isWeigh = isWeigh;
        this.unitPrice = unitPrice;
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
        //return "itemName:" + itemName + "isWeigh" + isWeigh;
        return super.toString();
    }

    public static void main(String[] args){

    }
}

