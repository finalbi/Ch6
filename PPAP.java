import java.util.*;
public class PPAP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text: ");
		System.out.println(ppap(scan.nextLine()));
	}
	public static String ppap (String str) {
		String object1 = str.substring(9, str.indexOf(','));
		String object2 = str.substring(str.indexOf(',')+11, str.length());
		object1 = String.valueOf(object1.charAt(0)).toUpperCase() + object1.substring(1, object1.length());
		return "Uh! " + object1 + " " + object2 + ".";
	}
}
