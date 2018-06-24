import java.lang.Math;
import java.io.*;

public class Exercise4
{
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
			
			double sine = Math.sin(val);
			double cosine = Math.cos(val);
			double sum = Math.pow(sine, 2) + Math.pow(cosine, 2);

			System.out.println("sine: "+ sine + " cosine: "+ cosine +" sum: "+sum);
	}
}