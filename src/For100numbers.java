
public class For100numbers
{

	public static void main(String[] args) 
	{
		int Zahl = 100; 
		while(Zahl>1) 
		{
		if (Zahl % 2 != 0) 
		{ 
		Zahl = Zahl*3+1;	 
		}
		else 
		{ 
		Zahl = Zahl/2;	 
		} 
		System.out.print(Zahl +", "); 
		}
		
	}

}