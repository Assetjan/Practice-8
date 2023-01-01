public class P8task9_37 {
	public static void main(String[] args) {
		String soz = "Helloo";
		// String soz1 = soz.substring(0,soz.length()/2);
		// String soz2 = soz.substring(soz.length()/2,soz.length());

		// System.out.print(soz2);
		// System.out.print(soz1);
		
		char a;
		char c;
		for ( int i = soz.length()/2; i < soz.length(); i++ ) {
			a = soz.charAt(i);
			System.out.print(a);
		}
		for ( int i = 0; i < soz.length()/2; i++) {
			c = soz.charAt(i);
			System.out.print(c);
		}
	}
}