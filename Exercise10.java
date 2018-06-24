import java.lang.Math;
import java.io.*;

public class Exercise10 {

	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		float rate = 0;
		float n = 0; 
		try
		{
			System.out.print("Enter cost per kilowatt-hour in cents:\n");
			name = dataIn.readLine();	
			rate = Float.parseFloat(name);
			System.out.print("Enter kilowatt-hours used per year:\n");
			name = dataIn.readLine();	
			n = Float.parseFloat(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Annual cost is "+  (rate * n)/ 100);	
	}
}