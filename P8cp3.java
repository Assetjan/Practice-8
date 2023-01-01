public class P8cp3 {
	public static void main(String[] args) {
		String word= "abcaab";
		int t = word.lastIndexOf("a");
		int t2 = word.lastIndexOf("b");
		int t3 = word.lastIndexOf("c");
		String word1 = word.replaceFirst("abcaab","Java"); 
		System.out.println(word1);
		}
}