public class P8cp1 {
	public static void main(String[] args) {
		String word= "HELLO";
		String word2 ="HELLO";
		String word3 ="hello";
		boolean res = word.equals (word2);
		boolean res2 = word.equals (word3);
		boolean res3 = word.equalsIgnoreCase(word3);
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
	}
}