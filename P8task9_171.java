import java.util.Scanner;

public class P8task9_171 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String soz = "asereesiu yerss Assetrt Yersttr";
		String soz1[] = soz.split(" ");
		int sum[] = new int[soz.length()];
		int sum1 = 0;
		int l;
		int k = 0;
		int min = 100000;
		for ( int i = 0; i<soz1.length; i++){
			l = soz1[i].length();
			if(min>l) min = l;
		}
		System.out.println(min);
	}
}