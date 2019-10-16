import java.util.ArrayList;


public class MyHashMap {

    private MyMap[] box;

    public MyHashMap(int countOfBoxes){
        box = new MyMap[countOfBoxes];
        for (int i = 0; i < box.length; i++) {
            box[i] = new MyMap();
        }
    }

    public void add(Item item){
        int itemHC = item.myHashCode();
        int boxNumber = itemHC % box.length;
        box[boxNumber].add(item);
    }

    @Override
    public String toString(){
        String result = "{ \n";
        for (MyMap map:box) {
            result += map + "\n";
        }
        result += "}";
        return result;
    }


}
