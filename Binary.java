import java.util.*;
public class Binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		System.out.println(convertToBinary(scan.nextInt()));
	}
	
	public static String convertToBinary (int num) {
		String result = "";
		String reverse = "";
		while(num != 0) {
			result += num%2;
			num = num/2;
		}
		for(int i = result.length()-1;i >= 0;i--) {
			reverse += String.valueOf(result.charAt(i));
		}
		return reverse;
	}
}
