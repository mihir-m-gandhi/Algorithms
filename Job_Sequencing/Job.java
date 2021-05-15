import java.util.*;

public class Job
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of jobs: ");
		int n=sc.nextInt();
		int d[]=new int[n];
		int p[]=new int[n];
		int p2[]=new int[n];
		int i;
		System.out.println("Enter the deadlines: ");
		for(i=0;i<n;i++)
		{
			d[i]=sc.nextInt();
		}
		System.out.println("Enter the profits: ");
		for(i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			p2[i]=p[i];
		}
		int j;
		int t,t2;
		for(i=1;i<n;i++)
		{
			t=p[i];
			t2=d[i];
			j=i-1;
			while(j>=0&&p[j]<=t)
			{
				p[j+1]=p[j];
				d[j+1]=d[j];
				j--;
			}
			p[j+1]=t;
			d[j+1]=t2;
		}
		System.out.println("");
		int dead=1;
		int profit=0;
		for(i=0;i<n;i++)
		{
			if(d[i]>=dead)
			{
				profit=profit+p[i];
				j=0;
				while(p2[j]!=p[i])
				{
					j++;
				}
				p2[j]=0;
				dead++;
				System.out.println("Job "+(j+1)+" done");
			}
			else
			{
				j=0;
				while(p2[j]!=p[i])
				{
					j++;
				}
				p2[j]=0;
				System.out.println("Job "+(j+1)+" not done");
			}
		}
			System.out.println("\n");
		System.out.println("The total profit is: "+profit);
	}
}