package AimsProject.test;

import AimsProject.store.Store;
import AimsProject.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "John", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fairy Tale", "Jane", 90, 15.49f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Sam", 110, 18.99f);

        Store store = new Store();

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        System.out.println("Store before removing DVD:");
        store.printStore();

        store.removeDVD(dvd2);

        System.out.println("Store after removing DVD:");
        store.printStore();
    }
}
