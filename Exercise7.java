import java.lang.Math;
import java.io.*;

public class Exercise7
{
	public static void main(String[] args) 
	{
		int cents = 0;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		try
		{
			System.out.print("Input the cents:\n");
			name = dataIn.readLine();	
			cents = Integer.parseInt(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		int dollar = cents / 100;
		int coins = cents % 100;
		System.out.println("That is "+ dollar+ " dollars and "+ coins+ " cents");
	}
}