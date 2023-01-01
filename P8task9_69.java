import java.util.Scanner;

public class P8task9_69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = "HelloAaAaaa. I am Asset! I am 17 yo? I dont know what to do.";
		String soz1 = soz.toLowerCase();
		int sum = 0;
		char a;
		for ( int i = 0; i<soz.length(); i++) {
			a = soz1.charAt(i);
			if (a == '.' || a == '?' || a == '!'){
				sum++;
			}
		}
		System.out.println(sum);
	}
}