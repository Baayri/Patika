public class Main {
    public static void main(String[] args) {

        int[][] matrix = { {2,3,4},
                {5,6,4} };

        System.out.println("Matris : ");

        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");

        int[][] newMatrix = new int [matrix[0].length][matrix.length];

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                newMatrix[col][rows] = matrix [rows][col];
            }
        }

        for (int[] rows : newMatrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}