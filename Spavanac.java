import java.util.Scanner;

public class Spavanac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();

        if(minutes >= 45) {
            System.out.println(hour + " " + (minutes-45));
        } else if(hour == 0 && minutes < 45) {
            System.out.println("23" + " " + (60 + minutes - 45));
        } else {
            System.out.println((hour - 1) + " " + (60 + minutes - 45));
        }
    }
}