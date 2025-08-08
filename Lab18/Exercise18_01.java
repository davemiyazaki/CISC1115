import java.util.Scanner;

public class Exercise18_01{

  public static int getMaxValueInArray(int[] array){
    int maxNumber = 0;
    for(int item : array){
      if(item > maxNumber){maxNumber = item;} 
    }
    return maxNumber;
  }

  public static char[] assignLetterScores(int[] studentsScores, int bestScore){
    char scores[] = new char[studentsScores.length];
    for(int item = 0; item < studentsScores.length; item++){
      if(studentsScores[item] >= bestScore-10){
        scores[item] = 'A';
      }else if(studentsScores[item] >= bestScore-20){
        scores[item] = 'B';
      }else if(studentsScores[item] >= bestScore-30){
        scores[item] = 'C';
      }else if(studentsScores[item] >= bestScore-40){
        scores[item] = 'D';
      }else{
        scores[item] = 'F';
      }
    }
    return scores;
  }

  public static int[] assignNumberScores(int[] studentsScore){
    Scanner inputRead = new Scanner(System.in);
    for(int i = 0; i < studentsScore.length; i++){studentsScore[i] = inputRead.nextInt();}
    return studentsScore;
  }

  public static void displayResult(int[] numberResultsArray, char[] assignedLetterResults){
    
    for(int item = 0; item < numberResultsArray.length; item++){

      System.out.println("Student " + item + " score is " + numberResultsArray[item] + " and grade is " + assignedLetterResults[item]);

    }

  }
 
  public static void main(String[] args){
    Scanner inputRead = new Scanner(System.in);   

    System.out.print("Enter the number of students: ");
    final int ARRAY_LENGTH  = inputRead.nextInt();


    int[] studentsScores = new int[ARRAY_LENGTH];

    System.out.print("Enter " + ARRAY_LENGTH + " scores: "); 
    studentsScores = assignNumberScores(studentsScores); 
    
    final int maxScore = getMaxValueInArray(studentsScores); 
    
    final char[] LETTER_SCORES = assignLetterScores(studentsScores, maxScore);

    displayResult(studentsScores, LETTER_SCORES);
  }
}
