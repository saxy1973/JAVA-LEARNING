import java.util.Scanner;

public class SearchElement {

    // Linear Search
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (Recursive)
    public static int BinarySearch(int[] arr, int low, int high, int target) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return BinarySearch(arr, mid + 1, high, target);
        } else {
            return BinarySearch(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int linearIndex = LinearSearch(data, target);

        if (linearIndex != -1) {
            System.out.println("Linear Search: Element found at index " + linearIndex);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        // Binary Search (Array must be sorted)
        int binaryIndex = BinarySearch(data, 0, n - 1, target);

        if (binaryIndex != -1) {
            System.out.println("Binary Search: Element found at index " + binaryIndex);
        } else {
            System.out.println("Binary Search: Element not found");
        }

        sc.close();
    }
}