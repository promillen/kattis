import java.util.Scanner;

public class QALYKattis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double QALY = 0;

        for(int i = 0; i < n; i++) {
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();
            QALY = firstNumber * secondNumber + QALY;
        }
        System.out.println(QALY);
    }
}