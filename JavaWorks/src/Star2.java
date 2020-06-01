
public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<11; i++)
		{
			if(i<6)
			{
				for(int j=0; j<=i; j++)
				{
					System.out.print("*");
				}
			}
			else 
			{
				for(int j=0; j<=(10-i); j++)
				{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}
