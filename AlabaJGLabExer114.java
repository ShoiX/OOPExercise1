import java.lang.Math;
import java.io.*;

public class Exercise14 {


	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		int price = 0;
		try
		{
			System.out.print("Enter amount of purchase:\n");
			name = dataIn.readLine();	
			price = Integer.parseInt(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		System.out.println("Discounted price: " + (int)(price - price * 0.10));
	}
}