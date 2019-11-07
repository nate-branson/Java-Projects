/*
 * GreatCircle.java
 * Nathan Branson
 */


public class GreatCircle {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		
		
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		
		
		double d = 60 * Math.acos(x1) * ((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		
		System.out.println(d);
	}	
	
}
