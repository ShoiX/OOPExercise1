import java.lang.Math;
import java.io.*;

public class Exercise11 {
	public static double dist(double t)
	{
		return (0.5) * 32.174 * Math.pow(t, 2);
	}

	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		double t = 0;
		try
		{
			System.out.print("Enter the number of seconds:\n");
			name = dataIn.readLine();	
			t = Double.parseDouble(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Distance: "+  dist(t));	
	}
}