public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {24, 8, 16, 32, 4};

        System.out.println("Data sebelum diurutkan:");
        printArray(data);

        insertionSort(data);

        System.out.println("\nData setelah diurutkan:");
        printArray(data);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
