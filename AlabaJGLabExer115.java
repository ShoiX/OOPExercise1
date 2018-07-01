import java.lang.Math;
import java.io.*;

public class Exercise15 {


	public static void main(String[] args) {
		final int boltprice = 5;
		final int nutprice = 3;
		final int washerprice = 1;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		int b = 0, n = 0, w = 0;
		int price = 0;
		try
		{
			System.out.print("Number of bolts:\n");
			name = dataIn.readLine();
			b = Integer.parseInt(name);
			price += b * boltprice;
			System.out.print("Number of nuts:\n");
			name = dataIn.readLine();	
			n = Integer.parseInt(name);
			price += n * nutprice;
			System.out.print("Number of washers:\n");
			name = dataIn.readLine();	
			w = Integer.parseInt(name);
			price += w * washerprice;
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		if (b > n)
			System.out.println("Check the order");
		System.out.println("Total Cost: " + price);
	}
}