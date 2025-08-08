import java.util.Arrays;

public class Lab22{
    public static void ascendingSort( int [] array){
       for(int index = 0; index < array.length; index++){
            int leastNumber = array[index];
            for(int subIndex = index+1; subIndex < array.length; subIndex++){
                if(leastNumber > array[subIndex]){ 
                    int tempHolder = leastNumber; 
                    leastNumber = array[subIndex]; 
                    array[subIndex] = tempHolder;
                }
            }
            array[index] = leastNumber;
       }
    }

    public static int binarySearch(int[] sortedArray, int key){
        int middleOfArrayIndex = sortedArray.length/2;
        if(key == sortedArray[middleOfArrayIndex]){
            return middleOfArrayIndex;
        }else if(key < sortedArray[middleOfArrayIndex]){
            for(int index = middleOfArrayIndex; index >= 0; index--){
                if(key == sortedArray[index]){return index;}
            }
            return -1;
        }else if(key > sortedArray[middleOfArrayIndex]){
            
            for(int index = middleOfArrayIndex; index > sortedArray.length; index++){
                if(key == sortedArray[index]){return index;}
            }
            return -1;
        }else{System.err.println("Something is off with the cycle."); return -1;}

    }

    public static void main(String[] args){
        int[] array = {3,2,7,1,0,5};

        System.out.println(Arrays.toString(array));

        ascendingSort(array);

        System.out.println(Arrays.toString(array));
        
        System.out.println(binarySearch(array, 0));
    }
}