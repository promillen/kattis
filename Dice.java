import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String GunnarsDice[] = sc.nextLine().split(" ");
        String EmmasDice[] = sc.nextLine().split(" ");

        int totalDieNumberGunnar = 0;
        int totalDieNumberEmma = 0;

        for(int i = 0; i < GunnarsDice.length; i++) {
            totalDieNumberGunnar += Integer.parseInt(GunnarsDice[i]);
        }

        for(int i = 0; i < EmmasDice.length; i++) {
            totalDieNumberEmma += Integer.parseInt(EmmasDice[i]);
        }

        if(totalDieNumberEmma > totalDieNumberGunnar) {
            System.out.println("Emma");
        } else if(totalDieNumberEmma < totalDieNumberGunnar) {
            System.out.println("Gunnar");
        } else {
            System.out.println("Tie");
        }
    }
}
