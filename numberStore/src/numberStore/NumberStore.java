/*
 * Author: gint271
 * 
 * Date: 5/19/2014
 * 
 * Stores numbers form user into hopfield network.  User can test to see if a number is stored.
 * Only stores positive numbers.  Also recognizes the inverse of the number as the same number.
 */

package numberStore;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberStore {

	public static void main(String[] args) 
	{
		int binarySize = 0;
		int size;
		HopfieldNetwork memory;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String goAgain = "Yes";
		String action = "Starter";
		
		System.out.println("What is the largest number you want to enter?");
		try
		{
			size = Integer.parseInt(keyboard.readLine());
		}
		catch (Exception e)
		{
			System.out.println("Had issue getting user's max number.");
			return;
		}
			
		//Finds how many bits are needed.
		while(size > 1)
		{
			size = size / 2;
			binarySize++;
		}
		
		memory = new HopfieldNetwork(binarySize);
		
		while(goAgain.equals("Yes"))
		{
			System.out.println("Check or Insert?");
			try
			{
				action = keyboard.readLine();
			}
			catch (Exception e)
			{
				System.out.println("Failed to read action.");
			}
			
			if(action.equals("Check"))
			{
				
			}
			if(action.equals("Insert"));
			{
				System.out.println("Enter the number to be inserted.");
				try
				{
					memory.saveNumber(Integer.parseInt(keyboard.readLine()));
				}
				catch (Exception e)
				{
					System.out.println("Failed to read number.");
					return;
				}
			}
			
			System.out.println("Would you like to enter or check another number?");
			try
			{
				goAgain = keyboard.readLine();
			}
			catch (Exception e)
			{
				System.out.println("Failed to goAgain.");
			}
		}
	}

}
