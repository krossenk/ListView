package com.krk.exercise3.Model;

/**
 * Created by Rossen on 21/04/15.
 */
public class GenbrugItem {
    private String itemName;
    private String description;
    private int imageId;

    public GenbrugItem(String newItemName, String newDescription, int newImageId) {
        this.itemName = newItemName;
        this.description = newDescription;
        this.imageId = newImageId;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(final String newItemName) {
        this.itemName = newItemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String newDescreption) {
        this.itemName = newDescreption;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int newImageId) {
        this.imageId = newImageId;
    }
}
