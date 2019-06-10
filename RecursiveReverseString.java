/**
 * 
 */
package recursionTestPractice;

/**
 * @author Nicola
 *
 */
public class RecursiveReverseString {
	
	public static String reverseRecusively(String str)	{
		System.out.println("In with : "+str);
		// base case to handle one char string and empty string
		if (str.length() < 2)	{
			System.out.println("Base case reached");
			return str;
		}
		return reverseRecusively(str.substring(1)) + str.charAt(0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = "Nicola";
		String reversedRecursively = reverseRecusively(name);
		System.out.println("Reversed Recusively : "+reversedRecursively);

	}

}
