/**
 * 
 */
package recursionTestPractice;

/**
 * @author Nicola
 *
 */
public class FactorialIteration {
	
	public int factorial(int n)	{
		int result = n;
		for (int loop = n-1; loop > 1; loop--)	{
			result *= loop;
			System.out.println("Result update: "+result);
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FactorialIteration factorialIteration = new FactorialIteration();
		System.out.println("Factorial 5! : "+factorialIteration.factorial(5));

	}

}
