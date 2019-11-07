/*
 * RandomIntFromRange.java
 * Nathan Branson
 */


public class RandomIntFromRange {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		y += 1;
		
		int z = y - x;
		
		double rand = Math.random();
		int val = (int) ((rand * z) + 1) + x;
		
		
		System.out.println(val);
	}
}
