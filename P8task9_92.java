import java.util.Scanner;

public class P8task9_92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = "Helll";
		char a;

		StringBuilder soz1 = new StringBuilder(soz);
		for ( int i = 0; i<soz.length(); i++) {
			if (i%2==0){

				soz1.setCharAt(i,'ы');
			}
		}
		System.out.println(soz1);
	}
}