public class P8task9_55{
	public static void main(String[] args) {
		String c0= "aello I am asot";
		char c = 'o';
		char c1 = 'a';

		for (int i = 0; i<c0.length(); i++){
			char a = c0.charAt(i);
			if(a == c || a == c1){
				System.out.println(i + " " + a);
			}
		}
	}
}