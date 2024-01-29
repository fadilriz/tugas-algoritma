public class BubbleSortDescending {
    public static void main(String[] args) {
        String[] data = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};

        System.out.println("Data sebelum diurutkan:");
        printArray(data);

        bubbleSortDescending(data);

        System.out.println("\nData setelah diurutkan secara descending:");
        printArray(data);
    }

    static void bubbleSortDescending(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Menggunakan compareTo untuk perbandingan string
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    // Tukar elemen jika elemen sekarang kurang dari elemen berikutnya
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(String[] arr) {
        for (String value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
