package org.fasttrack.exercises2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>();
        clothesShop.addItem(new Clothes("Bluza", 99, Category.NEW));
        clothesShop.addItem(new Clothes("Tricouri", 50, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Pantaloni", 150, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Geaca", 355, Category.NEW));
        clothesShop.addItem(new Clothes("Blugi", 111, Category.NEW));
        clothesShop.addItem(new Clothes("Costum baie", 99, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Sosete", 15, Category.REFURBISHED));

        System.out.println(clothesShop.findByCategory(Category.NEW));
        System.out.println("------------");
        System.out.println(clothesShop.findWithLowerPrice(150));
        System.out.println("------------");
        Optional<Clothes> optionalFindByName = clothesShop.findByName("Bluza");
        if (optionalFindByName.isPresent()){
            System.out.println(optionalFindByName.get());
        }
        System.out.println("------------");
        Optional<Clothes> optionalRemove = clothesShop.removeItem("Blugi");
        if (optionalRemove.isPresent()){
            System.out.println("Item deleted: " + optionalRemove.get());
        }

        System.out.println("------------");
        System.out.println("List after remove: " + clothesShop.getGenericList());
    }
}
