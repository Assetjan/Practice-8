import java.util.Scanner;

public class P8task9_139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = "0HelloAaAa4a3a. I am1 Asset. I am 17 yo.";
		int sum = 0;
		char a;
		boolean l;
		for ( int i = 0; i<soz.length(); i++) {
			a = soz.charAt(i);
			l = Character.isDigit(a);
			if (l){
				System.out.println(a);
			}
		}
		
	}
}