import java.lang.Math;
import java.io.*;

public class Exercise6
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		int rad = 0;
		try
		{
			System.out.print("Input the radius:\n");
			name = dataIn.readLine();	
			rad = Integer.parseInt(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		double area = Math.PI * Math.pow(rad, 2);
		System.out.println("The radius is: "+ rad+ " The area is: "+ area);
	}

}