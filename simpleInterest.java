import java.util.Scanner;

public class simpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculate simple interest ::");
    System.out.println("Enter principal amount");
    float principal = sc.nextFloat();
    System.out.println("Enter time duration in years");
    float years = sc.nextFloat();
    System.out.println("Enter rate of interest");
    float rate = sc.nextFloat();
    float interest = (principal*rate*years)/100;
    System.out.println("The overall interest amounts to Rs. "+interest+" for the given duration of "+years+" years and at "+rate+" % rate per annum");
    sc.close();
  }
}