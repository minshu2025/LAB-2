package PrelabQ2;
import java.util.Scanner;
import java.util.Arrays;

public class SearchingAlgorithms {
	
	 public static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    // Binary Search method (Array must be sorted)
	    public static int binarySearch(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return -1;
	    }

	    // Bubble Sort method
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take array input from user
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Linear Search");
	            System.out.println("2. Binary Search");
	            System.out.println("3. Bubble Sort");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the key to search: ");
	                    int key = scanner.nextInt();
	                    int result = linearSearch(arr, key);
	                    if (result != -1) {
	                        System.out.println("Key found at index: " + result);
	                    } else {
	                        System.out.println("Key not found.");
	                    }
	                    break;

	                case 2:
	                    bubbleSort(arr);  // Sort the array before binary search
	                    System.out.print("Enter the key to search: ");
	                    key = scanner.nextInt();
	                    result = binarySearch(arr, key);
	                    if (result != -1) {
	                        System.out.println("Key found at index: " + result);
	                    } else {
	                        System.out.println("Key not found.");
	                    }
	                    break;

	                case 3:
	                    bubbleSort(arr);
	                    System.out.println("Sorted array: " + Arrays.toString(arr));
	                    break;

	                case 4:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	            }
	        }
	    }
}
