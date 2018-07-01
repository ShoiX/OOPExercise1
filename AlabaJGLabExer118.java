import java.lang.Math;
import java.io.*;

public class Exercise18 {
	public static float compute(float price, float percent)
	{
		return price / (percent/100);
	}
	public static void main(String[] args) {
		final int limit = 250;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		float priceA = 0, priceB = 0;
		float percentA = 0, percentB = 0;
		try
		{
			System.out.print("Price per pound package A:\n");
			name = dataIn.readLine();	
			priceA = Float.parseFloat(name);

			System.out.print("Percent lean package A:\n");
			name = dataIn.readLine();	
			percentA = Float.parseFloat(name);

			System.out.print("Price per pound package B:\n");
			name = dataIn.readLine();	
			priceB = Float.parseFloat(name);

			System.out.print("Percent lean package B:\n");
			name = dataIn.readLine();	
			percentB = Float.parseFloat(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Package A cost per pound of lean: " + compute(priceA, percentA));
		System.out.println("Package B cost per pound of lean: " + compute(priceB, percentB));
		if (compute(priceA, percentA) < compute(priceB, percentB))
			System.out.println("Package A is the best value");
		else
			System.out.println("Package B is the best value");
		
	}
}