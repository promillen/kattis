import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double seedCost = scanner.nextDouble();
        int numberOfLawnsToSow = scanner.nextInt();
        double totalCost = 0;

        for(int i = 0; i < numberOfLawnsToSow; i++) {
            double width = scanner.nextDouble();
            double length = scanner.nextDouble();

            totalCost = totalCost + (width * length);
        }

        System.out.println(totalCost * seedCost);
    }
}