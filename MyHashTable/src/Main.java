import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Main {

    static String[] words;
    static int countOfItems = 1_000;
    static int sizeOfTable = 12;

    public static void main(String[] args) {
        int[] rawArray = initArray(1_000_000);
        MyIntHashTable table = new MyIntHashTable(sizeOfTable);

        for (int i = 0; i < countOfItems; i++) {
            table.add(rawArray[i]);
        }

        System.out.println("Количество элементов = " + countOfItems);
        System.out.println("идеальная длинна = " + (countOfItems *1.0 / sizeOfTable));
        System.out.println("Максимальная длинна = " + table.maxLengthOfChains());
        table.showChainLength();
//        System.out.println(table.contains("Трансифгурация"));

    }

    public static int[] initArray(int lenght){
        int[] result = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            result[i] = i;
        }
        Random r = new Random();
        for (int i = 0; i < lenght; i++) {
            int newIndex = r.nextInt(lenght);
            int temp = result[i];
            result[i] = result[newIndex];
            result[newIndex] = temp;
        }
        return result;
    }

    public static void readFromFile(){
        try(BufferedReader reader = new BufferedReader(
                    new FileReader("source.txt"))){
            String line = reader.readLine();
            words = line.split(" ");
        } catch (IOException e){
            System.out.println("Файл не существует");
        }
    }
}
