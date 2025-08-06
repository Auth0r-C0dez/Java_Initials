import java.util.Scanner;
public class cart {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String item ;
  int number ;
  double each_amount ;
  double total ;

  System.out.println("Enter the item you have chosen ");
  item = sc.nextLine() ;
  System.out.println("Enter the number of items chosen " );
  number = sc.nextInt();
  System.out.println("Enter the price of each item RS: " );
  each_amount = sc.nextDouble();
  total = number * each_amount ;
  System.out.println("Your total for " + number +" "+ item + " is " + total );
  sc.close();
}}
