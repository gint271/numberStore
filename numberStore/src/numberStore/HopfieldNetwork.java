package numberStore;

public class HopfieldNetwork 
{
	private int weightMatrix[][];
	private int size;
	
	HopfieldNetwork(int passSize)
	{
		this.size = passSize;
		this.weightMatrix = new int[size][size];
	}
	
	void saveNumber(int number)
	{
		int[] binaryNumber = new int[this.size];
		int power = this.size;
		
		while(number > 0)
		{
			if(number > Math.pow(2, power))
			{
				number = number - (int) Math.pow(2, power);
				System.out.print("1");
			}
			else
			{
				System.out.print("0");
			}
			
		}
	}
}
