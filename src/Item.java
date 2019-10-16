public class Item {

    private int key;
    private String value;

    public Item(int key, String value){
        this.key = key;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public int myHashCode(){
        return key*17;   //Во избежание коллизий лучше использовать здесь простое число.
    }

    @Override
    public String toString(){
        return key + "->" + value;
    }
}
