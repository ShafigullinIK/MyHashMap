import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(2);
        Item i1 = new Item(1, "S");
        Item i2 = new Item(2, "S2");
        map.add(i1);
        map.add(i2);
        map.add(new Item(3, "S2"));
        map.add(new Item(4, "S0"));
        map.add(new Item(1, "S5"));

        System.out.println(map);

    }

}
