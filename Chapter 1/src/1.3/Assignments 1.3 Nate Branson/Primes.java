/*
* Primes.java
* Nathan Branson
*/

public class Primes{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);

        int counter = 0;

        for (int i = 1; i <= n; i++){ 
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(i);
            }
            counter = 0;
        }
            
    }        
}
