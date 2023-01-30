package list;

import java.util.ArrayList;

public class CollectionTest {

    private static final String[] colors = {"red", "blue", "black", "gray"};
    private static final String[] removeColor = {"red", "gray"};

    public CollectionTest() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> remove = new ArrayList<String>();
        for (String color : colors) {
            list.add(color);
            System.out.println("liste:"+color);
        }
        for (String color : removeColor) {
            remove.add(color);
            System.out.println("arraylist:");
            for(int i=0;i<list.size();i++){
                System.out.println("liste:"+list.get(i));
                removeColor(list,remove);
                System.out.println("----");
                
                
            }
        }
    }

}
