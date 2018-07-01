import java.lang.Math;
import java.io.*;

public class Exercise16{


	public static void main(String[] args) {
		final float miles = 200;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		float capacity = 0, gauge = 0, mpg = 0;
		
		try
		{
			System.out.print("tank capacity:\n");
			name = dataIn.readLine();
			capacity = Float.parseFloat(name);

			System.out.print("Gauge reading:\n");
			name = dataIn.readLine();	
			gauge = Float.parseFloat(name);
			
			System.out.print("Miles per gallon:\n");
			name = dataIn.readLine();	
			mpg = Float.parseFloat(name);
			
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		// get the remaing gas
		float remaing = capacity - (capacity * (gauge / 100));
		
		if (remaing * mpg < miles)
			System.out.println("Get Gas!");
		else
			System.out.println("Safe to Proceed");
	}
}