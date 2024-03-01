import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }

        long startTime = System.nanoTime();

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Search running time: " + duration + " nanoseconds");
    }
}


public static void binarySearch(int[] array, int key) {
    int low = 0;
    int high = array.length - 1;
    int mid;

    long startTime = System.nanoTime();

    while (low <= high) {
        mid = low + (high - low) / 2;
        if (array[mid] < key) {
            low = mid + 1;
        } else if (array[mid] > key) {
            high = mid - 1;
        } else {
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Key " + key + " found at index: " + mid);
            System.out.println("Search running time: " + duration + " nanoseconds");
            return;
        }
    }

    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("Key not found");
    System.out.println("Search running time: " + duration + " nanoseconds");
}