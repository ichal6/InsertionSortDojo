import java.util.ArrayList;
import java.util.Collections;

public class SortAlgorithm {
    public static Integer[] insertSort(Integer[] array){
        for(int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static ArrayList<Integer> insertSort(ArrayList<Integer> array){
        for(int i = 1; i < array.size(); i++) {
            int key = array.get(i);
            int j = i - 1;
            while(j >= 0 && array.get(j) > key){
                array.set(j+1,array.get(j));
                j = j - 1;
            }
            array.set(j + 1, key);
        }
        return array;
    }
}
