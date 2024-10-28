import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cart {
    private List<DigitalVideoDisc> items = new ArrayList<>();
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            items.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.remove(disc)) {
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : items) {
            total += disc.getCost();
        }
        return total;
    }

    public void sortByTitle() {
        items.sort(Comparator.comparing(DigitalVideoDisc::getTitle)
                .thenComparing(Comparator.comparing(DigitalVideoDisc::getCost).reversed()));
    }

    public void sortByCost() {
        items.sort(Comparator.comparing(DigitalVideoDisc::getCost).reversed()
                .thenComparing(DigitalVideoDisc::getTitle));
    }

    public DigitalVideoDisc filterDVDsById(int id) {
        if (id >= 0 && id < items.size()) {
            return items.get(id);
        } else {
            System.out.println("DVD with specified ID not found.");
            return null;
        }
    }

    public DigitalVideoDisc filterDVDsByTitle(String title) {
        for (DigitalVideoDisc disc : items) {
            if (disc.getTitle().equalsIgnoreCase(title)) {
                return disc;
            }
        }
        System.out.println("DVD with specified title not found.");
        return null;
    }
}
