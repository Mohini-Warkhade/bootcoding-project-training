package com.bootcoding.restaurant;

public class MenuItem {
    private long menuItemId;
    private String menuItem;
    private double price;

    public long getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIsveg() {
        return isveg;
    }

    public void setIsveg(boolean isveg) {
        this.isveg = isveg;
    }

    private String category;
    private boolean isveg;

}
