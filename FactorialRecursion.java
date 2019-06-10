/**
 * 
 */
package recursionTestPractice;

/**
 * @author Nicola
 *
 */
public class FactorialRecursion {
	
	/**
	 * Recursive method that solves factorial values
	 * @param n
	 * @return
	 */
	public int fact(int n)	{
		int result;
		if (n ==1)	{
			//base case
			return 1;
		}
		result = fact(n - 1) * n;
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FactorialRecursion factorial = new FactorialRecursion();
		System.out.println("Factorial 5! : "+factorial.fact(5));

	}

}
