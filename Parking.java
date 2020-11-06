import java.util.Scanner;
import java.util.Arrays;   

public class Parking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();

        for(int i = 0; i < numberOfTestCases; i++) {
            int[] spacejunk = new int[scanner.nextInt()];

            for(int h = 0; h < spacejunk.length; h++) {
                spacejunk[h] = scanner.nextInt();
            }
            sortArray(spacejunk);

            int result = 0;

            for(int h = 0; h < spacejunk.length-1; h++) {
                result = result + (spacejunk[h+1] - spacejunk[h]);
            }

            result = result + (spacejunk[spacejunk.length - 1] - spacejunk[0]);

            System.out.println(result);
        }
    }

    public static void sortArray(int arr[]) {
        int temp = 0;
        for (int i = 0; i <arr.length; i++) {     
            for (int j = i+1; j <arr.length; j++) {     
                if(arr[i] > arr[j]) {      //swap elements if not in order
                    temp = arr[i];    
                    arr[i] = arr[j];    
                    arr[j] = temp;    
                }     
            }     
        }
    } 
}