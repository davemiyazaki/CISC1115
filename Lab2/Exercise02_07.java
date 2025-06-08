import java.util.Scanner;
public class Exercise02_07{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    float width = 0.0f; //defining as 0.0 to avoid magical numbers
    float height = 0.0f; //defining as 0.0 to avoid magical number
    System.out.print("Enter the width = ");
    width = input.nextFloat();
    
    System.out.print("Enter the height = ");
    height = input.nextFloat();

    float perimeter = (width + height) * 2; // saving results in variable for effective data management :)
    System.out.println("Perimeter of the rectangle = " + perimeter);

  }
}
