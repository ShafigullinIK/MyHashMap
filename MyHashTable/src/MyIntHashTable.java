import java.util.LinkedList;

public class MyIntHashTable {

    final int DEFAULT_SIZE = 10;

    private LinkedList<Integer>[] array;

    public MyIntHashTable() {
        array = new LinkedList[DEFAULT_SIZE];
        init();
    }

    public MyIntHashTable(int size) {
        array = new LinkedList[size];
        init();
    }

    public void init() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList();
        }
    }

    public int maxLengthOfChains(){
        int max = 0;
        for (LinkedList list: array) {
            if(max < list.size()){
                max = list.size();
            }
        }
        return max;
    }

    public void add(int item) {
        int index = myHashFunc(item);
        array[index].add(item);
    }

    public boolean contains(int item){
        int index = myHashFunc(item);
        return array[index].contains(item);
    }

    public int myHashFunc(int item) {
        return item % array.length;
    }

//    public int obJtoInt(String item){
//        int base = 128;
//        int result = 0;
//        int pow = 1;
//        for (int i = item.length() - 1; i >= 0; i--) {
//            result += (item.charAt(i)) * pow;
//            pow *= base;
//        }
//        return result;
//    }

    public void showChainLength(){
        for (LinkedList list: array) {
            System.out.println("Длинна = " + list.size());
        }
    }


}
