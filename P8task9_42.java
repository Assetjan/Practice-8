import java.util.Scanner;
public class P8task9_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String soz = sc.next(); //hello
		
		char a;
		for ( int i = soz.length()-1; i>=0; i-- ) {
			a = soz.charAt(i);
			System.out.print(a);
		}
	}
}