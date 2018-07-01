import java.lang.Math;
import java.io.*;

public class Exercise13 {


	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		float x  = 0;
		float y  = 0;
		try
		{
			System.out.print("Enter X:\n");
			name = dataIn.readLine();	
			x = Float.parseFloat(name);
			System.out.print("Enter Y:\n");
			name = dataIn.readLine();	
			y = Float.parseFloat(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Arithmetic mean: " + ((x + y) / 2));
		System.out.println("Harmonic mean: "+ (2 / (1/x + 1/y)));	
	}
}