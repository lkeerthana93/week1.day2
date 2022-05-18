package week1.day2;

public class Calculator {

	public int addition(int num1,int num2,int num3)
	{
		int sum=num1+num2+num3;
		return sum;
	}
	public void subtraction(int num1,int num2)
	{
		System.out.println(num1-num2);
	}
	public void multiplication(double num1,double num2)
	{
		System.out.println(num1*num2);
	}
	public void division(float num1,float num2)
	{
		System.out.println(num1/num2);
	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.addition(4, 2, 2));
		cal.subtraction(4, 2);
		cal.multiplication(44.82, 33.67);
		cal.division(7, 2);
	}
}
