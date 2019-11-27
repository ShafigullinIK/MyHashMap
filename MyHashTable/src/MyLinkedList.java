import java.util.LinkedList;

public class MyLinkedList {
    LinkedList<String> list;

    public MyLinkedList(){
        list = new LinkedList<>();
    }

    public void add(String item){
        list.add(item);
    }

    public int size(){
        return list.size();
    }

    public boolean contains(String item){
        return list.contains(item);
    }
}
