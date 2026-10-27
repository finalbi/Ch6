import java.util.*;
public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text: ");
		System.out.println(isPalindrome(scan.nextLine()));
	}
	
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		String processed = "";
		String reverse = "";
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		for(int i = 0;i < str.length();i++) {
			if (!nonLetters.contains(String.valueOf(str.charAt(i)))) {
				processed += String.valueOf(str.charAt(i));
			}	
		}
		for(int i = processed.length()-1;i >= 0;i--) {
			reverse += String.valueOf(processed.charAt(i));
		}
		return processed.equals(reverse);
	}
}
