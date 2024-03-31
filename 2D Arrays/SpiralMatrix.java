public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startColm = 0;
        int endRow = matrix.length - 1;
        int endColm = matrix[0].length - 1;

        while (startRow <= endRow && startColm <= endColm) {
            // Top
            for (int j = startColm; j <= endColm; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColm] + " ");
            }
            // Bottom
            for (int j = endColm - 1; j >= startColm && endRow != startRow; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i > startRow && endColm != startColm; i--) {
                System.out.print(matrix[i][startColm] + " ");
            }
            startRow++;
            startColm++;
            endColm--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        printSpiral(matrix);
    }
}
