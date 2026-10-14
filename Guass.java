public class Guass {
	public static void main(String[] args) {
		System.out.println(guass(1000,4));
	}
	public static double guass(double x, int n) {
		double result = 0;
		int loop = 0;
		while (loop < n) {
			result += pow(-1,loop) * pow(x,2*loop)/factorial(loop);
			loop++;
		}
		return result;
	}
	public static double factorial(int x) {
		if (x == 0) return 1;
		return x*factorial(x-1);
	}
	public static double pow(double a, int b) {
		double result = 1;
		int loop = 0;
		while (loop < b) {
			result *= a;
			loop++;
		}
		return result;
	}
}
