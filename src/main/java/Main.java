import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {0};
        try {
            numbers = FileOperation.readFromFile("src/main/resources/one_thousand.txt");
            numbers = SortAlgorithm.insertSort(numbers);
            FileOperation.saveToFile("src/main/resources/sorted_one_thousand.txt", numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(Integer i: numbers)
//        System.out.println(i);

    }
}
