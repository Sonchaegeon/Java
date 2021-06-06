package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Network");
        list.add(2, "Database");
        list.add("OS");

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for(String l: list) {
            String str = l;
            System.out.println(str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("Spring");

        for(String l: list) {
            String str = l;
            System.out.println(l);
        }
    }
}
