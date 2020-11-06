import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthlyMegaBytes = scanner.nextInt();
        int n = scanner.nextInt();
        int nextMonth = monthlyMegaBytes;

        for(int i = 0; i < n; i++) {
            nextMonth = nextMonth + (monthlyMegaBytes - scanner.nextInt());
        }
        System.out.println(nextMonth);
    }
}