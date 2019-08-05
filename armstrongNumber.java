import java.util.Scanner;

public class armstrongNumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ::");
    int input_number = sc.nextInt();
    int sum = 0,x=input_number;
    while(x != 0){
      int remainder = x%10;
      sum = sum+(remainder*remainder*remainder);
      x = x/10;
    }
    if(sum == input_number){
      System.out.println("The given number ::"+input_number+ " is armstrong number");
    } else {
      System.out.println("The given number ::"+input_number+ " is not an armstrong number");
    }
    sc.close();
  }
}