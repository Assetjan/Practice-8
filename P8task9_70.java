import java.util.Scanner;

public class P8task9_70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = "HelloAaAaaa. I am Asset. I am 17 yo.";
		String soz1 = soz.toLowerCase();
		int sum = 0;
		char a;
		for ( int i = 0; i<soz.length(); i++) {
			a = soz1.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y'){
				sum++;
			}
		}
		System.out.println(sum);
	}
}