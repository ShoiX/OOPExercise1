import java.lang.Math;
import java.io.*;

public class Exercise8
{
	public static void main(String[] args) {
		int change = 0;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
		String name = "";
		try
		{
			System.out.print("Input the change:\n");
			name = dataIn.readLine();	
			change = Integer.parseInt(name);
		}catch(IOException e)
		{	
			System.out.println("An error has occured\n");
			System.exit(1);
		}
		String[] d = {"dollar", "quarter", "dime", "nickel", "cent"};
		int[] values  = {100, 25, 10, 5, 1};
		int[] num = {0,0,0,0, 0};
		int total = 0;
		int ctr = 0;
		for (int i = 0; i < 5; i++)
		{
			num[i] = change / values[i];
			change = change % values[i];
			total += num[i];
			ctr = num[i] > 0 ? ctr+1 : ctr;
		}
		boolean flag = false;
		System.out.print("Your change is: ");
		for (int i = 0; i < 5; i++)
		{
			if (i != 0 && total == num[i] && flag && total > 0)
			{
				System.out.print(" and ");
			}
			if (num[i] > 0)
			{
				System.out.print(num[i]+ " "+ d[i] + (num[i] > 1 ? "s" : "") +(i < ctr-1 ? ", ": ""));
				flag = true;
			}
			total -= num[i];
		}
		System.out.println((ctr == 0 ? "0": "") + ".");
	}
}