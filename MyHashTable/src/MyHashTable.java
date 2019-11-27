import java.util.LinkedList;

public class MyHashTable {

    final int DEFAULT_SIZE = 10;

    private MyLinkedList[] array;

    public MyHashTable() {
        array = new MyLinkedList[DEFAULT_SIZE];
        init();
    }

    public MyHashTable(int size) {
        array = new MyLinkedList[size];
        init();
    }

    public void init() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new MyLinkedList();
        }
//        for (MyLinkedList list : array) {
//            list = new MyLinkedList();
//        }
    }

    public int maxLengthOfChains(){
        int max = 0;
        for (MyLinkedList list: array) {
            if(max < list.size()){
                max = list.size();
            }
        }
        return max;
    }

    public void add(String item) {
        int index = myHashFunc(item);
        array[index].add(item);
    }

    public boolean contains(String item){
        int index = myHashFunc(item);
        return array[index].contains(item);
    }

    public int myHashFunc(String item) {
        return Math.abs(obJtoInt(item)) % array.length;
    }

    public int obJtoInt(String item){
        int base = 128;
        int result = 0;
        int pow = 1;
        for (int i = item.length() - 1; i >= 0; i--) {
            result += (item.charAt(i)) * pow;
            pow *= base;
        }
        return result;
    }

    public void showChainLength(){
        for (MyLinkedList list: array) {
            System.out.println("Длинна = " + list.size());
        }
    }


}
