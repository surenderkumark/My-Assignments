package week2.day1;

public class PalindromeNumberUsingForLoop {
	
			public static void main(String[] args) {

			int input = 12345;
			int temp = input;
			int output = 0;
			int remainder;

			for (input = input; input > 0; input = input / 10) {
	            remainder = input % 10;
				output = (output * 10) + remainder;
			}

			if (temp == output) {
				System.out.println("It is a palindrome");
			} 
			else 
			{
				System.out.println("It is Not a palindrome");
			}

		}

}
