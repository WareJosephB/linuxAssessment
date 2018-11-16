
public class Math {

	public static double add(double number1, double number2) {
		return number1+number2;
	}
	
	public static double subtract(double number1, double number2) {
		return number1-number2;
	}
	
	public static double multiply(double number1, double number2) {
		return number1*number2;
	}
	
	public static double divide(double number1, double number2) {
		return number1/number2;
	}
	
	public static void main(String[] args) {
		System.out.println("1+2=");
		System.out.println(add(1,2));
		System.out.println("9-4=");
		System.out.println(subtract(9,4));
		System.out.println("15*5=");
		System.out.println(multiply(15,5));
		System.out.println("6/7=");
		System.out.println(divide(6,7));
		
	}
	
	
}
