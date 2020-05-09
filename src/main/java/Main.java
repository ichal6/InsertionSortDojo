import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        long timeRun = startTime();
        Integer[] numbers = {0};
        try {
            numbers = FileOperation.readFromFile(args[0]);
            numbers = SortAlgorithm.insertSort(numbers);
            FileOperation.saveToFile("sorted_" + args[0], numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(Integer i: numbers)
//        System.out.println(i);
        System.out.println(String.format("time run: %.0f ms",stopTime(timeRun)));
    }

    private static long startTime(){
        return System.nanoTime();
    }

    private static Double stopTime(long startTime){
        long endTime = System.nanoTime();
        Double start = Double.valueOf(startTime);
        Double end = Double.valueOf(endTime);
        return (end - start)/1000000.0;
    }
}
