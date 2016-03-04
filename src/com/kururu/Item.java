package com.kururu;

/**
 * Created by Ellery Queen on 2016/3/4.
 */
public enum Item {

    ITEM000001("badminto",false),
    ITEM000002("cpp_primer_5th",false),
    ITEM000003("apple",true),
    ITEM000004("banana",true),
    ITEM000005("cola",false);

    private String itemName;
    private boolean isWeigh;

    Item(String itemName,boolean isWeigh){
        this.itemName = itemName;
        this.isWeigh = isWeigh;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isWeigh() {
        return isWeigh;
    }

    @Override
    public String toString() {
        return "itemName:" + itemName + "isWeigh" + isWeigh;
    }
}

