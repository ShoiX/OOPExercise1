import java.lang.Math;
import java.io.*;

public class Exercise3
{
	private static double ave(double[] arr, int n)
	{
		double sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];
		return sum/n;
	}
	public static void main(String[] args)
	{
		double[] rainfall = new double[3];
		String[] months = {"April", "May", "June"};
		String name = "";
		for (int i = 0; i < 3; i ++)
		{
			BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
			try
			{
				System.out.print("Rainfall for "+months[i]+ ": ");
				name = dataIn.readLine();
				rainfall[i] = Integer.parseInt(name);
			}catch(IOException e)
			{	
				rainfall[i] = 0;
			}
		}
		System.out.println("Average rainfall: "+ave(rainfall, 3));
	}
}