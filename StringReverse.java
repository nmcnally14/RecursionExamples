/**
 * 
 */
package recursionTestPractice;

/**
 * @author Nicola
 *
 */
public class StringReverse {
	
	/**
	 * Iterative method to reverse a string
	 * @param str
	 * @return
	 */
	public static String reverse(String str)	{
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = str.toCharArray();
		
		for (int i = strChars.length - 1; i >= 0; i--)	{
			strBuilder.append(strChars[i]);
		}
		return strBuilder.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = "Nicola";
		String reversedIteratively = reverse(name);
		System.out.println("Reversed Iteratively : "+reversedIteratively);

	}

}
