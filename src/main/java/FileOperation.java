import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {
    public static Integer[] readFromFile(String filename) throws IOException {
        Integer[] numbers;
        List<Integer> contentFromFile = new ArrayList<>();

        File file = new File(filename);


        BufferedReader br = new BufferedReader(new FileReader(file));

        while (br.ready()){
            contentFromFile.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        return numbers = contentFromFile.toArray(new Integer[0]);
    }
}
