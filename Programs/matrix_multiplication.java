public class matrix_multiplication {

  public static void display(int[][] m) {
    int row = m.length;
    int col = m[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static int[][] multiply(int[][] m1, int[][] m2) {
    int row1 = m1.length;
    int col1 = m1[0].length;
    int row2 = m2.length;
    int col2 = m2[0].length;

    if (col1 != row2) {
      System.out.println(
          "Error: Cannot multiply matrices. Number of columns in first matrix does not match number of rows in second matrix.");
      return null;
    }

    int[][] result = new int[row1][col2];

    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col2; j++) {
        for (int k = 0; k < col1; k++) {
          result[i][j] += m1[i][k] * m2[k][j];
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {

    // matrix - 1
    int[][] m1 = { { 1, 2, 4 }, { 2, 3, 5 } };
    display(m1);

    // matrix - 2
    int[][] m2 = { { 4, 5, 7 }, { 8, 6, 5 }, { 1, 3, 4 } };
    display(m2);

    // multiplying both
    int[][] m3 = multiply(m1, m2);
    display(m3);

  }
}
