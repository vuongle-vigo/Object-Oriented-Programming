package AimsProject.test;

import AimsProject.cart.Cart;
import AimsProject.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "Director1", 120, 20.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fantasy", "Director2", 90, 15.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Toy Story", "Animation", "Director3", 110, 25.0f);


        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        cart.printCart();

        DigitalVideoDisc searchedByID = cart.searchByID(2);
        if (searchedByID != null) {
            System.out.println("Found DVD by ID: " + searchedByID.getTitle());
        }

        DigitalVideoDisc searchedByTitle = cart.searchByTitle("Cinderella");
        if (searchedByTitle != null) {
            System.out.println("Found DVD by Title: " + searchedByTitle.getTitle());
        }
    }
}
