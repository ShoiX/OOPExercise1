import java.lang.Math;
import java.io.*;
public class Exercise1
{
	private static double quadratic(double x)
	{
		return (3 * Math.pow(x, 2)) - (8 * x) + 4;
	}
	public static void main(String[] args)
	{
		double val = 0;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		try
		{
			System.out.print("Enter value: ");
			name = dataIn.readLine();
			val = Double.parseDouble(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		double result = quadratic(val);
		System.out.println(result);
	}
}