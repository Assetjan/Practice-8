import java.util.Scanner;

public class P8task9_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String soz = "looHel67";
		int k = sc.nextInt();
		String soz1 = soz.substring(0,k);
		String soz2 = soz.substring(k,soz.length());

		System.out.print(soz2);
		System.out.print(soz1);
		
		// char a;
		// char c;
		// for ( int i = k; i < soz.length(); i++ ) {
		// 	a = soz.charAt(i);
		// 	System.out.print(a);
		// }
		// for ( int i = 0; i < k; i++) {
		// 	c = soz.charAt(i);
		// 	System.out.print(c);
		// }

	}
}