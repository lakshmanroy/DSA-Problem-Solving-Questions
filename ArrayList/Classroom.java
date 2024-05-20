// package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9);

        System.out.println(list);

        // get operations

        // int element = list.get(2);

        // System.out.println(element);

        // Delete
        // list.remove(2);
        // System.out.println(list);

        // set

        // list.set(2, 10);
        // System.out.println(list);

        // contains

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}
