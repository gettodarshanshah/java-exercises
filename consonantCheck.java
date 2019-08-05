import java.util.Scanner;

public class consonantCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character ::");
    char c = sc.next().charAt(0);
    switch (c) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
      System.out.println("A vowel");
      break;
    default:
      System.out.println("A consonant");
      break;
    }
    sc.close();
  }
}