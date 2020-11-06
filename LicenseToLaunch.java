import java.util.Scanner;

public class LicenseToLaunch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] spacejunk = new int[arraySize];
        int index = 0;

        for(int i = 0; i < spacejunk.length; i++) {
            spacejunk[i] = scanner.nextInt();
        }

        int min = spacejunk[0];

        for(int i = 0; i < spacejunk.length; i++)
        {
            if(min > spacejunk[i])
            {
                min = spacejunk[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}