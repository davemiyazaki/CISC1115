import java.util.Scanner;
public class Exercise3_04 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int m = 0, r = 0;
    System.out.print("Please enter value for m: ");
    m = input.nextInt();
    System.out.print("Please enter value for r: ");
    r = input.nextInt();

    System.out.println("The result of mr^2 is " + (m * Math.pow(2, r)));
  }
}
