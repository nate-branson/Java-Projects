/*
 * MercatorProjection.java
 * Nathan Branson
 */
public class MercatorProjection {
	public static void main(String[] args) {
		// center 
		double center = Double.parseDouble(args[0]);
		double longi = Double.parseDouble(args[1]);
		double latit = Double.parseDouble(args[2]);

		double x = longi - center;
		double y = (Math.log(1+Math.sin(latit)/(1-Math.sin(latit))))*.5;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
