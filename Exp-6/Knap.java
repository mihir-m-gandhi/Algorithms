import java.util.*;

class Knap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the max. weight the knapsack can carry: ");
		int w=sc.nextInt();
		System.out.println("Enter the no. of items: ");
		int n=sc.nextInt();
		System.out.println("Enter the weights and profits: ");
		int a[][]=new int[n][];
		int b[][]=new int[n+1][];
		for(i=0;i<n;i++)
		{
			a[i]=new int[2];
			for(j=0;j<2;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		b[0]=new int[w+1];
		for(i=1;i<=n;i++)
		{
			b[i]=new int[w+1];
			for(j=1;j<=w;j++)
			{
				if(a[i-1][0]>j)
				{
					b[i][j]=b[i-1][j];
				}
				else
				{
					b[i][j]=Math.max(b[i-1][j],(b[i-1][j-(a[i-1][0])])+a[i-1][1]);
				}
			}
		}
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=w;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Profit is "+b[n][w]);
		j=n;
		i=w;
		while(j>=1)
		{
			if(b[j][i]!=b[j-1][i])
			{
				System.out.println("Object "+j+" selected");
				i=i-a[j-1][0];
			}
		  j--;
		}
		System.out.print("\n\nProgram by Mihir Gandhi B1 1611077 \n");
	}
}