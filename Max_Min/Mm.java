import java.util.*;

class Mm
{	
	public static int M=-999,m=999,m2,M2;
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int i;
		System.out.print("Enter the no. of inputs: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=rand.nextInt(100);
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		Mm obj=new Mm();
		obj.find(a,0,n-1,Mm.M,Mm.m);
		obj.disp(Mm.M,Mm.m);
	}
	
	public void find(int a[],int si, int ei, int M, int m)
	{
		if(si==ei)
		{
			Mm.m2=a[si];
			Mm.M2=a[si];
			if(Mm.m2<Mm.m)
			{
				Mm.m=Mm.m2;
			}
			if(Mm.M2>Mm.M)
			{
				Mm.M=Mm.M2;
			}
		}
		else if(si==ei-1)
		{
			if(a[si]<a[ei])
			{
				Mm.m2=a[si];
				Mm.M2=a[ei];
			}
			else
			{
				Mm.M2=a[si];
				Mm.m2=a[ei];
			}
			if(Mm.m2<Mm.m)
			{
				Mm.m=Mm.m2;
			}
			if(Mm.M2>Mm.M)
			{
				Mm.M=Mm.M2;
			}
		}
		else
		{
			int mid=(si+ei)/2;
			find(a,si,mid,Mm.M,Mm.m);
			find(a,mid+1,ei,Mm.M,Mm.m);
		}
	}
	
	public void disp(int M,int m)
	{
		System.out.println("\nMax: "+Mm.M+" Min: "+Mm.m);
	}
	
}