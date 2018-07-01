import java.lang.Math;
import java.io.*;

public class Exercise12 {


	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		double t  = 0;
		try
		{
			System.out.print("Enter a double:\n");
			name = dataIn.readLine();	
			t = Double.parseDouble(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Base 2 log of "+t+" is "+  Math.log(t)/Math.log(2));	
	}
}