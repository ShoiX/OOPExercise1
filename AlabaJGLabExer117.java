import java.lang.Math;
import java.io.*;

public class Exercise17 {
	public static void main(String[] args) {
		final int limit = 250;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		double weight = 0;
		try
		{
			System.out.print("Enter weight:\n");
			name = dataIn.readLine();	
			weight = Double.parseDouble(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		if (weight > limit + 30 || weight < limit - 39)
			System.out.println("Bad");
		else
			System.out.println("Good");
		
	}
}