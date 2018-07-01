import java.lang.Math;
import java.io.*;

public class Exercise9 {

	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		float v = 0;
		float r = 0; 
		try
		{
			System.out.print("Input voltage:\n");
			name = dataIn.readLine();	
			v = Float.parseFloat(name);
			System.out.print("Input resistance:\n");
			name = dataIn.readLine();	
			r = Float.parseFloat(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Current is "+ v / r + " ampere");	
	}
}