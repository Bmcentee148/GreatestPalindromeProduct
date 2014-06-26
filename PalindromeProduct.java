/* This class is designed to find the greatest palindrome product of 
	3 digit numbers. I.e the highest possible number to test is 
	999 * 999. */

class PalindromeProduct{

	public static void main(String [] args){
		System.out.println(isPalindrome(2120212));
		System.out.println(isPalindrome(5));
		System.out.println(isPalindrome(300020));

	}

	public static boolean isPalindrome(int num){
		String numForward = String.valueOf(num);
		StringBuilder temp= new StringBuilder(numForward);
		String numBackward = temp.reverse().toString();

		return numForward.equals(numBackward);
	}
}