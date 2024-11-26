package AimsProject.test;
import AimsProject.disc.DigitalVideoDisc;

class Wrapper {
    private Object object;

    public Wrapper(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object newObject) {
        this.object = newObject;
    }
}

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // swap(jungleDVD, cinderellaDVD);
        Wrapper wrapperDvd1 = new Wrapper(jungleDVD);
        Wrapper wrapperDvd2 = new Wrapper(cinderellaDVD);
        swap(wrapperDvd1, wrapperDvd2);
        
        System.out.println("Jungle title DVD: " + jungleDVD.getTitle());
        System.out.println("Cinderella title DVD: " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle title DVD: " + jungleDVD.getTitle());
    }


    // public static void swap(Object dvd1, Object dvd2) {
    //     Object temp = dvd1;
    //     dvd1 = dvd2;
    //     dvd2 = temp;
    // }

    public static void swap(Wrapper wrapper1, Wrapper wrapper2) {
        Object temp = wrapper1.getObject();
        wrapper1.setObject(wrapper2.getObject());
        wrapper2.setObject(temp);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(newTitle);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
