import java.util.Scanner;

public class Nasty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            int revWithoutAdv = scanner.nextInt();
            int revWithAdv = scanner.nextInt() - scanner.nextInt();
            if(revWithoutAdv < revWithAdv) {
                System.out.println("advertise");
            } else if(revWithAdv == revWithoutAdv) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
        scanner.close();
    }
}
