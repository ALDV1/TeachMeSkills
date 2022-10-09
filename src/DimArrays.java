public class DimArrays {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 5}, {5, 2, 6, 11}, {10, 58, 21, 5}, {1, 90, 55, 2}};
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int sumsSide = 0;
        int rows = arr.length - 1;
        for (int i = 0; i < arr.length; ++i) {
            sumsSide += arr[rows - i][i];
        }
        System.out.println("\nSum is " + sumsSide);
    }
}