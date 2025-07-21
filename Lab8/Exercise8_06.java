import java.util.Scanner; 
public class Exercise8_06 {
  public static void main (String args[]){
    // enter month and year 
    // display number of days in that months 
    // check if the year is leap for February entry
    Scanner input = new Scanner(System.in); 
    int uiMonth = 0; // initilizing variable for later user input (ui) 
    int uiYear = 0; // initilizing variable for later user input (ui) 
    int days = 0;
    boolean isLeapYear = false; 

    System.out.print("Enter a month in the year (e.g. 1 for Jan): "); 
    uiMonth = input.nextInt(); 
    isMonthEven = uiMonth % 2 == 0 ? true : false; 

    System.out.print("Enter a year: "); 
    uiYear = input.nextInt(); 

    isLeapYear = uiYear % 4 == 0 ? true : false; 
    
    if(uiMonth == 2)
      days = isLeapYear ? 29 : 28;

    if(uiMonth > 7) //days would be reveresed
      days = isMonthEven ? 31 : 30;
    else 
      days = isMonthEven ? 30 : 31;

       System.out.println(uiMonth = "/" + uiYear " has "+ days +  " days");
  }
 }
