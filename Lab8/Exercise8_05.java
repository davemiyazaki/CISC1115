import java.util.Scanner; 
public class Exercise8_05 {
  public static void main (String args[]){
    final int MAX_NUMBER_RANGE = 10;

    Scanner input = new Scanner(System.in); 
    final int FIRST_RAND_NUMBER = (int)(Math.random() * MAX_NUMBER_RANGE);
    final int  SECOND_RAND_NUMBER = (int)(Math.random() * FIRST_RAND_NUMBER);
    final int CORRECT_RESULT = FIRST_RAND_NUMBER - SECOND_RAND_NUMBER;
    final String DISPLAY_EXPRESSION = (String)(FIRST_RAND_NUMBER + " - " + SECOND_RAND_NUMBER);
    int userInput = 0; // initilizing variable for later use
    
    System.out.print("What is " + DISPLAY_EXPRESSION + "? "); 
    userInput = input.nextInt(); 
    if(userInput == CORRECT_RESULT) 
      System.out.println("You are correct!");
    else {
      System.out.println("Your answer is wrong.");
      System.out.println(DISPLAY_EXPRESSION + " should be " + CORRECT_RESULT);
    }
  }
 }
