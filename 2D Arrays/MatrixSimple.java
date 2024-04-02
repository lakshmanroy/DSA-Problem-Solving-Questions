public class MatrixSimple {
        public static void printSpiral(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            int top = 0, bottom = m - 1, left = 0, right = n - 1;
    
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++)
                    System.out.print(matrix[top][i] + " ");
                top++;
    
                for (int i = top; i <= bottom; i++)
                    System.out.print(matrix[i][right] + " ");
                right--;
    
                if (top <= bottom) {
                    for (int i = right; i >= left; i--)
                        System.out.print(matrix[bottom][i] + " ");
                    bottom--;
                }
    
                if (left <= right) {
                    for (int i = bottom; i >= top; i--)
                        System.out.print(matrix[i][left] + " ");
                    left++;
                }
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
            };
    
            printSpiral(matrix);
        }
    }
    
