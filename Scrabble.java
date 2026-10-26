import java.util.*;
public class Scrabble {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = scan.nextLine();
		System.out.print("Enter letters: ");
		System.out.println(canSpell(word, scan.nextLine()));
	}
	
	public static boolean canSpell(String word,String letters) {
		String checked = "";
		for(int i = 0;i < word.length();i++) {
			if (checked.contains(String.valueOf(word.charAt(i)))) continue;
			if (letterCount(word.charAt(i), letters) < letterCount(word.charAt(i), word)) return false;
			checked += String.valueOf(word.charAt(i));
		}
		return true;
	}
	public static int letterCount(char c, String s) {
		int count = 0;
		for(int i = 0;i < s.length();i++) {
			if (c == s.charAt(i)) count++;
		}
		return count;
	}
}
