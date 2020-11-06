import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] modulo = new int[10];

        for(int i = 0; i < 10; i++) {
            modulo[i] = scanner.nextInt() % 42;
        }

        System.out.println(countDistinct(modulo, modulo.length)); 
    }

    static int countDistinct(int arr[], int n) { 
        int res = 1; 
  
        // Pick all elements one by one 
        for (int i = 1; i < n; i++)  
        { 
            int j = 0; 
            for (j = 0; j < i; j++) 
                if (arr[i] == arr[j]) 
                    break; 
    
            // If not printed earlier,  
            // then print it 
            if (i == j) 
                res++; 
        } 
        return res; 
    } 
}
