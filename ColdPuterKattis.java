import java.util.Scanner;

public class ColdPuterKattis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int nrNegativeTemp = 0;

        for(int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if(t<0) {
                nrNegativeTemp++;
            }
        }
        System.out.println(nrNegativeTemp);
    }
}