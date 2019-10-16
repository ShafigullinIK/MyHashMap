import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(10);
        Item i1 = new Item(1, "S");
        Item i2 = new Item(2, "S2");
        map.add(i1);
        map.add(i2);
        map.add(new Item(3, "S2"));
        map.add(new Item(4, "S0"));
        map.add(new Item(44, "S0"));
        map.add(new Item(41, "S0"));
        map.add(new Item(42, "S0"));
        map.add(new Item(43, "S0"));
        map.add(new Item(445, "S0"));
        map.add(new Item(145, "S5"));
//        System.out.println(map);
//        System.out.println(map.containsPair(new Item(445, "S0")));
//        System.out.println(map.containsPair(new Item(445, "S1")));
        System.out.println(map.getOrDefault(43).getValue());
        System.out.println(map.getOrDefault(4345).getValue());

        Set<String> mySet = new HashSet<>();


    }

}
