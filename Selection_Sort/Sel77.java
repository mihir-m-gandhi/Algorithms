import java.util.*;

class Sel77
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int i,j,temp,s,count=0;
		System.out.print("Enter the no. of inputs: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=rand.nextInt(100);
		}
		for(i=0;i<n;i++) 
		{		
		    s=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[s])
				{
					s=j;
				}
				count++;
			}
			temp=a[s];
			a[s]=a[i];
			a[i]=temp;
	    }
		System.out.println(" ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nNo. of swaps is "+count);
	}
}