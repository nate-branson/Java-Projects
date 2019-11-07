
public class Ruler2 {
	public static void main(String[] args) {
		String ruler1 = "1 -\n";
		String ruler2 = ruler1 + "2 --\n" + ruler1;
		String ruler3 = ruler2 + "3 ---\n" + ruler2;
		String ruler4 = ruler3 + "4 ----\n" + ruler3;
		
		System.out.println(ruler4);
		
	}
}
