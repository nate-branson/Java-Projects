/**
 * SongsInSequence.java
 * @author Nathan Branson
 */


public class SongsInSequence{
    public static void main(String[] args){
        // getting number of songs in playlist
        
        double probNum = 0;
        int num = 0;
        double trials = 100000;
        double prob = 0.000;

        System.out.println("Number of trials for each playlist: " + (int)trials + "\n");

        
        for (int i = 0; i < args.length; i++){

            probNum = 0;
            // songs in playlist
            for (int t = 0; t < trials; t++){

                num = 0;
                
                int[] n = new int[Integer.parseInt(args[i])];

                // creates playlist of length args[i]
                for (int k = 0; k < n.length; k++){
                    n[k] = k;
                }
                
                // shuffling playlist
                for(int j = 0; j < n.length; j++){
                    int r = j + (int)(Math.random() * (n.length - j));
                    int temp = n[j];
                    n[j] = n[r];
                    n[r] = temp;
                }

                
                for (int l = 0; l < n.length - 1; l++){
                    if (n[l] == n[l+1]-1){
                        num ++;
                    }
                }
                if (num == 0){
                    probNum++;
                }
            }
            prob = (probNum / trials);            
            System.out.println("The probability of playing sequential songs in playlist " + (i+1) + " is " + prob + "%"); 
        }

    }
}