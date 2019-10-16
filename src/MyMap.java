import java.util.ArrayList;

public class MyMap {

    private ArrayList<Item> map;

    public MyMap(){
        map = new ArrayList<>();
    }

    public void add(Item item){
        boolean flag = false;
        for(Item it : map) {
            if(it.getKey() == item.getKey()){
                it.setValue(item.getValue());
                flag = true;
            }
        }
        if(flag == false) map.add(item);
    }

    @Override
    public String toString(){
        String result = "[ ";
        for (Item it:map) {
            result += it.toString() + "; ";
        }
        result +="]";
        return result;
    }

}
