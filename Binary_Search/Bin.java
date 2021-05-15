import java.util.*;

class Bin
{	
	public static int flag=0;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the no. of inputs: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter sorted array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the no. to be searched: ");
		int s=sc.nextInt();
		Bin obj=new Bin();
		obj.find(a,0,n-1,s);
	}
	
	public void find(int a[],int si,int ei,int s)
	{
		if(si>ei)
		{
			System.out.println("Not found");
		}
		else
		{
			int mid=(si+ei)/2;
			if(s==a[mid])
			{
				System.out.println("Found at position "+(mid+1));
				Bin.flag=1;
			}
			else if(s<a[mid])
			{
				ei=mid-1;
				find(a,si,ei,s);
			}
			else 
			{
				si=mid+1;
				find(a,si,ei,s);
			}
		}
	}
}