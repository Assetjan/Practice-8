import java.util.Scanner;

public class P8task9_49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = sc.next();
		for ( int i = 0; i<soz.length(); i++) {
			System.out.print("*");
		}
		System.out.print(soz);
		for ( int i = 0; i<soz.length(); i++) {
			System.out.print("*");
		}

	}
}