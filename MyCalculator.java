package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.addition(4, 2, 2));
		cal.subtraction(4, 2);
		cal.multiplication(44.82, 33.67);
		cal.division(7, 2);
	}
}
