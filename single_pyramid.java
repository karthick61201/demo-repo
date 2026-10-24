
import java.util.Scanner;

class single_pyramid 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) 
		{
            for (j = 1; j <= (2 * n - 1); j++) 
			{
                if (j <= n - i || j >= n + i) 
				{
                    System.out.print("  ");
                } else 
				{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
	sc.close();
    }
}
