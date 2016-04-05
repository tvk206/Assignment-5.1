import java.util.Scanner;
public class Mathematical {

	
	public static void main (String[] args){
			
		output (HExponent(input()));
		output (FAddition(input(), input()));
		output (GComplication(input(), input(), input()));
	}

	public static void output(int x) {
		System.out.println(x);
	}
		
	public static int input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a number");
		return keyboard.nextInt();
	}
	
		public static int HExponent(int x) {
		return x*x*x*x*x*x*x*x*x*x; // or use a loop
	}   
	public static int FAddition (int x, int y) {
		return x + y;
	}

	
	
	
	public static double power(double z, int y) { //will only work with positive
	    double answer = 1;
	    if (y != 0) {
	        int absexp = y > 0 ? y : (-1) * y;
	        for (int i = 1; i <= absexp; i++) {
	            answer *= z;
	        }

	        if (y < 0) {
	            answer = 1.0 / answer;
	        }
	    } else {
	        answer = 1;
	    }

	    return answer;
	}
	
	public static int abs(int y) {
		if (y >=0) {
			return y;
		} else {
			return y * (-1);
					
		}
	}

	public static double sqrt(int number) {
		double t;
		double x = number / 2;
	 
		do {
			t = x;
			x = (t + (number / t)) / 2;
		} while ((t - x) != 0);
	 
		return x;
	}
	
	public static int GComplication (int x, int y, int z) {
		return   (int) (sqrt(x) + abs (y) + power(z, y));
	}
}