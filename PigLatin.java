import java.util.*;
public class PigLatin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text: ");
		System.out.println(pigLatin(scan.nextLine()));
	}
	
	
	public static String pigLatin (String msg) {
		String result = "";
		String currentWord = "";
		for (int i = 0;i < msg.length();i++) {

			if (msg.charAt(i) == ' ') {
				if (currentWord.length() > 2) result += translate(currentWord) + " ";
				else result += currentWord + " ";
				currentWord = "";
			}
			else if (i == msg.length()-1) {
				currentWord += String.valueOf(msg.charAt(i));
				if (currentWord.length() > 2) result += translate(currentWord) + " ";
				else result += currentWord + " ";
			}
			else {
				currentWord += String.valueOf(msg.charAt(i));
			}
		}
		return result;
	}
	public static String translate(String st) {
		String vowel = "AEIOUaeiou";
		if (vowel.contains(String.valueOf(st.charAt(0)))) {
			st = st.substring(1,st.length()) + "yay";
		}
		else {
			st = st.substring(1,st.length()) + String.valueOf(st.charAt(0)) + "ay";
		}
		return st;
		
	}
}
