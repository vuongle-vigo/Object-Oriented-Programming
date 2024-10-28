public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Action", "Movie 2", 20.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("John Doe", "Comedy", "Movie 3", 15.0f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost: " + cart.totalCost());

        cart.sortByTitle();
        System.out.println("Cart sorted by title.");

        cart.sortByCost();
        System.out.println("Cart sorted by cost.");

        DigitalVideoDisc foundDisc = cart.filterDVDsByTitle("Movie 2");
        if (foundDisc != null) {
            System.out.println("Found DVD: " + foundDisc.getTitle());
        }

        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("DVD removed from cart.");

        dvd2.playDemo();
    }
}
