import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int totalMiles = 0;
        int lastTime = 0;
        int newTime = 0;
        int calculatedTime = 0; 
            for(int i = 0; i < n; i++) {
                int speed = scanner.nextInt();
                if(speed > -1) {

                    newTime = scanner.nextInt();
                    calculatedTime = newTime - lastTime;

                    totalMiles = totalMiles + (speed * calculatedTime);

                    lastTime = newTime;
                }
            }
            System.out.println(totalMiles + " miles");
        
    }
}