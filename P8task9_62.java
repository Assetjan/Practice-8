import java.util.Scanner;

public class P8task9_62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = sc.nextLine();
		String soz1 = soz.toLowerCase();
		String soz2 = soz1.replace(" ","");
		double sum = 0;
		char a;
		for ( int i = 0; i<soz2.length(); i++) {
			a = soz2.charAt(i);
			if (a == 'a'){
				sum++;
			}
		}
		double t = soz2.length();
		double res = (sum*100)/t;
		System.out.println(res+"%");
		System.out.println(soz2.length());
	}
}