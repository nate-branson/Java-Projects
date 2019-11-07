/*
 * ColorConverter.java
 * Nathan Branson
 */

public class ColorConverter {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);

		if(r == 0 && g == 0 && b == 0) {
			int c = 0;
			int m = 0;
			int y = 0;
			int k = 1;
			
			System.out.println("" + c + m + y + k);
			
		}
		else {
			int w1 = Math.max(r / 255, g / 255);
			int w = Math.max(w1, b / 255);
			int c = (w - (r / 255)) / w;
			int m = (w - (g / 255)) / w;
			int y = (w - (b / 255)) / w;
			int k = 1 - w;
			System.out.println("" + c + m + y + k);
		}
		
		
	}

}
