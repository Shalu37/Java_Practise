import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();


        //add
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println(list);


        //get
        int element = list.get(3);
        System.out.println(element);


        //to add element in between
        list.add(1,10);
        System.out.println(list);


        //to set element
        list.set(0,4);
        System.out.println(list);


        //to remove element
        list.remove(3);
        System.out.println(list);


        //to get size of the array 
        int size = list.size();
        System.out.println(size);


        //Loops on array list 
        for(int i =0; i<list.size(); i ++){
            System.out.println(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

    }

}