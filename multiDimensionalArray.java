import java.util.Scanner;

public class multiDimensionalArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows for the array");
    int rows = sc.nextInt();
    System.out.println("Enter the columns for the array");
    int columns = sc.nextInt();
    // initializing multidimesional array
    int[][] multiDimArray = new int[rows][columns];
    System.out.println("Enter all the elements");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        multiDimArray[i][j] = sc.nextInt();
      }
    }
    System.out.print("\nData you entered : \n");
    for (int[] x : multiDimArray) {
      for (int y : x) {
        System.out.print(y + "        ");
      }
      System.out.println();
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        boolean flag = true;
        int x = multiDimArray[i][j];
        for (int k = 2; i < x / 2; i++) {
          if (x % k == 0) {
            flag = false;
            break;
          }
        }
        if (flag) {
          System.out.println(x + " is prime number");
        }
      }
    }
    sc.close();
  }
}