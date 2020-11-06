import java.util.Scanner;

public class GerryMandering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int precints = sc.nextInt();
        int districts = sc.nextInt();

        int[][] districtVotes = new int[districts][2];

        for(int i = 0; i < precints; i++) {
            int district = sc.nextInt();
            districtVotes[district-1][0] += sc.nextInt();
            districtVotes[district-1][1] += sc.nextInt();
        }

        double totalVotesLostForA = 0;
        double totalVotesLostForB = 0;

        for(int i = 0; i < districts; i++) {
            if(districtVotes[i][0] > districtVotes[i][1]) {
                System.out.print("A ");
                int temp1 = (districtVotes[i][0] - districtVotes[i][1]);
                int temp2 = districtVotes[i][0] - districtVotes[i][1] - (temp1 / 2 + 1);
                System.out.print(temp2);
                totalVotesLostForA += temp2;
                System.out.println(" " + districtVotes[i][1]);
                totalVotesLostForB += districtVotes[i][1];
            } else {
                System.out.print("B " + districtVotes[i][0]);
                totalVotesLostForA += districtVotes[i][0];
                int temp1 = (districtVotes[i][1] - districtVotes[i][0]);
                int temp2 = districtVotes[i][1] - districtVotes[i][0] - (temp1 / 2 + 1);
                System.out.println(" " + temp2);
                totalVotesLostForB += temp2;
            }

            

        }

        double totalVotes = 0;
        for(int i = 0; i < districts; i++) {
            totalVotes += districtVotes[i][0] + districtVotes[i][1];
        }
        //System.out.println("Totalvotes: " + totalVotes);
        //System.out.println("Total lost votes for A: " + totalVotesLostForA);
        //System.out.println("Total lost votes for B: " + totalVotesLostForB);

        double temp1 = Math.abs(totalVotesLostForA-totalVotesLostForB);
        double E_gap = (temp1/totalVotes);
        //System.out.println("E_gap = " + E_gap);
        System.out.println(E_gap);
    }
}
