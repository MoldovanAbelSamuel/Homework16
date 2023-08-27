package org.fasttrack.exercises2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop <T extends ShopItem> {

    private List<T> genericList;

    public Shop() {
        this.genericList = new ArrayList<>();
    }

    public void addItem(T item){
        this.genericList.add(item);
    }

    public List<T> findByCategory (Category category){
        List<T> inCategory = new ArrayList<>();
        for (T currentElement : this.genericList){
            if (category.equals(currentElement.category())){
                inCategory.add(currentElement);
            }
        }
        return inCategory;
    }

    public List<T> findWithLowerPrice (int maxPrice){
        List<T> lowerPrice = new ArrayList<>();
        for (T currentElement : this.genericList){
            if (currentElement.price() < maxPrice){
                lowerPrice.add(currentElement);
            }
        }
        return lowerPrice;
    }

    public Optional<T> findByName (String name){
        for (T currentElement : this.genericList){
            if (currentElement.name().equals(name)){
                return Optional.of(currentElement);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem (String name){
        for (int i = 0; i < this.genericList.size(); i++){
            if (this.genericList.get(i).name().equals(name)){
                return Optional.of(this.genericList.remove(i));
            }
        }
        return Optional.empty();
    }

    public List<T> getGenericList() {
        return genericList;
    }
}
