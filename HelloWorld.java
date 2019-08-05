import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args){
    System.out.println("hello world !!");   
    Scanner sc = new Scanner(System.in);
    int numberOfPeaches = sc.nextInt();
    int numberOfBoxes = numberOfPeaches/20;
    System.out.println("No. of Boxes required ::"+numberOfBoxes);
    System.out.println("No. of Peaches Left  ::"+numberOfBoxes);
    sc.close();
  }
}