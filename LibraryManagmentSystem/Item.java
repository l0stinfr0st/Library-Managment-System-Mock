package LibraryManagmentSystem;

import java.util.ArrayList;
import java.util.Random;

public class Item {

    private String name;
    private int catalog;
    private ArrayList catalogList = new ArrayList<Integer>();

    public Item(String name) {
        this.name = name;
        Random rnd = new Random();
        this.catalog = rnd.nextInt(1000000);
        while (catalogList.contains(this.catalog)) {
            this.catalog = rnd.nextInt(1000000);
        }
    }
    
    public String getName(){
        return this.name;
    }
    public int getCatalog(){
        return this.catalog;
    }

}
