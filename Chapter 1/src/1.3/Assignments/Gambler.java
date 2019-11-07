/*
* Gambler.java
* Nathan Branson
*/
public class Gambler{
    public static void main(String[] args){
        // stake, goal, trials, betProb, maxBets

        int stake = 10;
        int goal = 20;
        int trials = 1;
        double betProb = .5;
        int maxBets = 80;


        if (args.length == 5){
            stake = Integer.parseInt(args[0]);
            goal = Integer.parseInt(args[1]);
            trials = Integer.parseInt(args[2]);
            betProb = Double.parseDouble(args[3]);
            maxBets = Integer.parseInt(args[4]);
        }

        int bets = 0;
        int wins = 0;
        int totCash = 0;
        int cash = stake;
        for (int t = 0; t < trials; t++){
            cash = stake;
            while (cash > 0 && cash < goal && bets <= maxBets){
                bets++;
                if (Math.random() < betProb) cash++;
                else cash--;

                if (trials == 1){
                    for (int i = 0; i <= cash; i++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            if (cash == goal) wins++;
            totCash += cash;
        }
        System.out.println("The gambler won " + totCash + "$.");
        System.out.println(100 * wins / trials + "% wins.");
        System.out.println("Avg # bets:" + bets / trials);
    }
}