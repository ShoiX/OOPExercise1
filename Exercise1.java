import java.lang.Math;

public class Exercise1
{
	private static double quadratic(double x)
	{
		return (3 * Math.pow(x, 2)) - (8 * x) + 4;
	}
	public static void main(String[] args)
	{
		double result = quadratic(2);
		System.out.println(result);
	}
} 