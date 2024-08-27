package PostLabQ1;
import java.util.Random;
public class LinearSearchExecutionTime {

	public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index where the key is found
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Generate an array of 100,000 random integers
        int[] array = new int[100000];
        Random random = new Random(); // Create an instance of Random
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(); // Fill array with random integers
        }

        // 1. Best Case: Key is the first element
        int keyBest = array[0];
        long startTime = System.currentTimeMillis();
        linearSearch(array, keyBest);
        long endTime = System.currentTimeMillis();
        long executionTimeBest = endTime - startTime;
        System.out.println("Best Case Execution Time: " + executionTimeBest + " ms");

        // 2. Average Case: Key is in the middle
        int keyAverage = array[array.length / 2];
        startTime = System.currentTimeMillis();
        linearSearch(array, keyAverage);
        endTime = System.currentTimeMillis();
        long executionTimeAverage = endTime - startTime;
        System.out.println("Average Case Execution Time: " + executionTimeAverage + " ms");

        // 3. Worst Case: Key is the last element or not found
        int keyWorst = array[array.length - 1]; // You can also use a key that is not in the array
        startTime = System.currentTimeMillis();
        linearSearch(array, keyWorst);
        endTime = System.currentTimeMillis();
        long executionTimeWorst = endTime - startTime;
        System.out.println("Worst Case Execution Time: " + executionTimeWorst + " ms");
    }
}
