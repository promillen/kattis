import java.util.Scanner;

public class ReverseBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        String valToBinary = Integer.toBinaryString(val);

        StringBuilder sb = new StringBuilder(valToBinary);
        String reverse = sb.reverse().toString();
        System.out.println(Integer.parseInt(reverse,2));
    }
}