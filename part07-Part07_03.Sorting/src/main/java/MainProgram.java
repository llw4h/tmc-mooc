
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int num : array){
            if (num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallestNum = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallestNum){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++){
            if (table[i] < table[index]){
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++){
            swap(array, indexOfSmallestFrom(array, i), i);
            //System.out.println(Arrays.toString(array));
        }
        
    }

}
