import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Lab21 {


    public static int findSize(File file) throws IOException {
        Scanner input = new Scanner(file);
        int size = 0;
        while(input.hasNextLine()){
            String garbageCollector = input.nextLine();
            size++;
        }

        input.close();
        System.err.println("Size of the data is " + size);
        return size;
    }

    public static void readIntoArray(String[] fname, String[] lname, double[] grades, File file) throws IOException {

        Scanner scanner = new Scanner(file);
        int takenDataSize = 0;
            while(scanner.hasNextLine() && takenDataSize < fname.length){
                fname[takenDataSize] = scanner.next();
                lname[takenDataSize] = scanner.next();
                grades[takenDataSize] = scanner.nextDouble();
                takenDataSize++;
            }
        scanner.close();
    }

    public static void printGrades(String[] fname, String[] lname, double[] grades){
        for(int index = 0; index < fname.length; index++){
            System.err.print("First name = " + fname[index] + " ");
            System.err.print("Last name = " + lname[index] + " ");
            System.err.println("Grade = " + grades[index]);
        }
    }
    public static void main(String args[]){
        File file = new File("gradesData.txt");
        int DATASIZE = 0;
        try{
              DATASIZE = findSize(file);
        }catch(IOException e){
            System.err.println(e);

        } 
        String [] fname = new String[DATASIZE];
        String [] lname = new String[DATASIZE];
        double [] grades = new double[DATASIZE];

        try {readIntoArray(fname, lname, grades, file);}catch(IOException e){System.err.println(e);}

        printGrades(fname, lname, grades);




    }
}
