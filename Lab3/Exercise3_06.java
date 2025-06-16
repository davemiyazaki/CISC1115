import java.util.Scanner;
public class Exercise3_06 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final int SECONDS_IN_HOUR = 3600;
    final int SECONDS_IN_MINUTE = 60;
    int secondsUserInput = 0; //initilizing to avoid magical numbers
    
    System.out.print("Enter the time in seconds: ");
    secondsUserInput = input.nextInt();

    final int HOURS = secondsUserInput / SECONDS_IN_HOUR;
    final int REMINDER_HOURS = secondsUserInput % SECONDS_IN_HOUR;
    final int MINUTES = REMINDER_HOURS / SECONDS_IN_MINUTE; 
    final int REMINDER_MINUTES = REMINDER_HOURS % SECONDS_IN_MINUTE;
    final int SECONDS = REMINDER_MINUTES;

    System.out.println(secondsUserInput + " seconds equals to " + HOURS + " hours " + MINUTES + " minutes " + SECONDS + " seconds");
  }
}
