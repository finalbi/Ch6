import java.util.*;
public class Abecedarian {
	
	public static void main(String[] args) {
		System.out.print("Enter word: ");
		Scanner scan = new Scanner(System.in);
		System.out.println(isAbecedarian(scan.next()));
	}
	public static boolean isAbecedarian(String a) {
		a = a.toLowerCase();
		char last = a.charAt(0);
		for(int i = 0;i < a.length();i++) {
			if (last > a.charAt(i)) return false; 
			last = a.charAt(i);
		}
		return true;
	}
	
}
