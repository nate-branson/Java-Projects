/*
 * DayOfWeek.java
 * Nathan Branson
 */

public class DayOfWeek {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		
		int y = year - (14 - month) / 12;
		int x = y + (y / 4) - (y / 100) + (y / 400);
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		
		System.out.println(d);

	}

}
