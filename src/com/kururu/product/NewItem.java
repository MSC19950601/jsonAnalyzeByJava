package com.kururu.product;

/**
 * Created by Ellery Queen on 2016/3/6.
 */
public class NewItem {

    //get from ticket
    private String goodsID;
    private int amount;

    //get from SQL
    private double unitPrice;
    private String goodsName;
    private boolean isDiscountNintyFivePercents;
    private boolean isDoubleByOne;

    public NewItem(String goodsID, int amount) {
        this.goodsID = goodsID;
        this.amount = amount;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setDiscountNintyFivePercents(boolean discountNintyFivePercents) {
        isDiscountNintyFivePercents = discountNintyFivePercents;
    }

    public void setDoubleByOne(boolean doubleByOne) {
        isDoubleByOne = doubleByOne;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public int getAmount() {
        return amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public boolean isDiscountNintyFivePercents() {
        return isDiscountNintyFivePercents;
    }

    public boolean isDoubleByOne() {
        return isDoubleByOne;
    }
}
