/*
*Factors.java
*Nathan Branson
*/

public class Factors{
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);
        for(long factor = 2; factor <= n/factor; factor++){
            System.out.print(n + " ");
            while (n % factor == 0){
                n /= factor;
                System.out.print(factor + " ");
                
            }
            System.out.println();
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}