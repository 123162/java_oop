package mainn;

import java.util.ArrayList;

public class Mainn {

    public static void yazdir(ArrayList<String> a) {

        for (int i = 0; i < a.size(); i++) {

            System.out.println("Element " + (i + 1) + ": " + a.get(i));

        }
    }

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("Metallica");
        array.add("Guns' n Roses");
        array.add("Black Sabbath");
        array.add("Iron Maiden");
        array.add("Megadeth");

        // System.out.println(arraylist.get(0));
        //System.out.println(arraylist.get(3));
        // System.out.println(arraylist.get(5));
        // System.out.println(arraylist.size());
        //arraylist.remove(1);
        //arraylist.remove("Metallica");
        /*System.out.println(arraylist.indexOf("Metallica"));
        System.out.println(arraylist.lastIndexOf("Metallica"));
        System.out.println(arraylist.indexOf("Dream Theater"));*/
        //arraylist.set(4,"Megadeth");
        yazdir(array);

    }

}
