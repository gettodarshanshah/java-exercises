import java.util.Scanner;

public class Booking{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int available_seats = 4;
    System.out.println("Enter request for tickets ");
    int req_tickets = sc.nextInt();
    if(available_seats >= req_tickets){
      System.out.println("Booking accepted.");
    } else {
      System.out.println("Booking is not possible.");
    }
    sc.close();
  }
}