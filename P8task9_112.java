import java.util.Scanner;

public class P8task9_112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = "HelloA";
		int k = sc.nextInt();
		StringBuilder soz1 = new StringBuilder(soz);
		for ( int i = 0; i<soz.length(); i++) {
			if (i==k){

				soz1.setCharAt(i,'ы');
			}
		}
		System.out.println(soz1);
	}
}