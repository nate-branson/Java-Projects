/**
 * Based on example from Sedgewick and Wayne, Intro to Programming
 * in Java, page 68.
 * 
 * @author David Owen
 * @editor Nathan Branson
 */
public class Kary {

    public static void main(String[] args) {
        
        int i = 3;
        int k = 10;

        if (args.length == 2) {
            i = Integer.parseInt(args[0]);
            k = Integer.parseInt(args[1]);
        }
        
        int power = 1;
        

        while (power <= i / k) {
            power *= k;
        }
        
        while (power > 0) {
            int d = i/power;
            System.out.print(d);
            i -= power * d;            
            power /= k;
        }
        
        System.out.println();
    }
}
