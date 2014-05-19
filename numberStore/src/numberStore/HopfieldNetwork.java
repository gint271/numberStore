package numberStore;

public class HopfieldNetwork 
{
	int weightMatrix[][];
	int size;
	
	HopfieldNetwork(int passSize)
	{
		this.size = passSize;
		this.weightMatrix = new int[size][size];
	}
	
	void saveNumber(int number)
	{
		int[] binaryNumber = new int[this.size];
	}
}
