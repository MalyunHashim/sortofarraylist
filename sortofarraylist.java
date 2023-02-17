package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sortofarraylist {
    public static void main(String[] args) {

        ArrayList<String> spices = new ArrayList<String>();
        spices.add("Garlic powder");
        spices.add("chilli powder");
        spices.add("Rosemarry");
        Collections.sort(spices);
        for (String i : spices) {

            System.out.println(i);

        }
    }
}