import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggestCakeSlice = 0;
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        if(x <= (n/2)) {
            x = n - x;
        }
        int y = scanner.nextInt();
        if(y <= (n/2)) {
                y = n - y;
        }
        biggestCakeSlice = x * y * 4;
        System.out.println(biggestCakeSlice);
    }
}