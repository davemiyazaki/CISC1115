import java.util.Scanner;
public class Exercise3_05 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final int DEBT = 1000;
    final int PAYMENT_MONTHLY= 65;
    final int MONTHS_TO_PAYOFF_DEBT = DEBT / PAYMENT_MONTHLY;
    final double PAYMENT_LAST_MONTH = PAYMENT_MONTHLY + DEBT % PAYMENT_MONTHLY;
    System.out.println("Paying off $" + DEBT + " will take " + MONTHS_TO_PAYOFF_DEBT + " months and the last payment will be $" + PAYMENT_LAST_MONTH + ".");
  }
}
