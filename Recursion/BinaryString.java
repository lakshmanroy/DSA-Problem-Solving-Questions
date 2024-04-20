public class BinaryString {
    public static void printBinaryString(int n, int lastPlaces, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlaces == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, 0, " ");
    }
}
