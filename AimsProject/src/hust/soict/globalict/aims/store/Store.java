package AimsProject.src.hust.soict.globalict.aims.store;

import java.util.ArrayList;
import java.util.List;

import AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
    private List<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
    }

    public boolean removeDVD(DigitalVideoDisc dvd) {
        return itemsInStore.remove(dvd);
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        int index = 1;
        for (DigitalVideoDisc dvd : itemsInStore) {
            System.out.println(index + ". DVD - " + dvd.getTitle() + " - " + dvd.getCategory() + 
                " - " + dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + " $");
            index++;
        }
        System.out.println("***************************************************");
    }
}
