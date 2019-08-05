public class Pyramid {
  public static void main(String ar[]) {
    int rows = 6, k=0;
    for (int i = 1; i < rows; i++, k = 0) {
      for (int spaces = 1; spaces <= rows - i; spaces++) {
        System.out.print(" ");
      }
      while (k != 2 * i - 1) {
        System.out.print("*");
        ++k;
      }
      System.out.println();
    }
  }
}