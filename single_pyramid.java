class single_pyramid	
{
	public static void main(String args[])
	{
		int i, j;
		for (i = 1; i <= 4; i++)
		{
			for(j = 1; j <= 7; j++)
			{
				if((i == 1 && j == 1) || (i == 1 && j == 2) || (i == 1 && j == 3) || 
                 (i == 1 && j == 5) || (i == 1 && j == 6) || (i == 1 && j == 7))	
				{
					System.out.print("  ");
				}
				else if((i == 2 && j == 1) || (i == 2 && j == 2) || (i == 2 && j == 6) 											|| (i == 2 && j == 7))     
				{
					System.out.print("  ");
				}	
				else if((i == 3 && j == 1) || (i == 3 && j == 7))
				{
					System.out.print("  ");
				}
				else 
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}