package org.fasttrack.exercises2;

public class Fruits implements ShopItem{

    private String name;
    private int price;
    private Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public Category category() {
        return this.category;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
