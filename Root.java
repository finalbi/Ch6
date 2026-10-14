public class Root {
	public static void main(String[] args) {
		System.out.println(squareRoot(5));
	}
	public static double squareRoot(double a) {
		double guess = a / 2.0;
		double lastGuess = 0;
		double currentGuess = 0;
		while (Math.abs(guess-lastGuess) >= 0.0001) {
			currentGuess = (guess + a/guess)/2.0;
			lastGuess = guess;
			guess = currentGuess;
		}
		return guess;
	}
}
