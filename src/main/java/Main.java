import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        long timeRun = startTime();
        Integer[] numbers = {0};
        try {
            numbers = FileOperation.readFromFile(args[0]);
            System.out.println(String.format("time of read from file: %.0f ms", stopTime(timeRun)));
            timeRun = startTime();
            numbers = SortAlgorithm.insertSort(numbers);
            System.out.println(String.format("time of sort: %.0f ms", stopTime(timeRun)));
            timeRun = startTime();
            FileOperation.saveToFile("sorted_" + args[0], numbers);
            System.out.println(String.format("time of save to file: %.0f ms", stopTime(timeRun)));
        } catch (IOException e) {
            e.printStackTrace();
        }
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
