import java.util.*;

public class Ksack
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total weight that can be carried: ");
		float weight=sc.nextFloat();
		System.out.println("Enter the no. of items: ");
		int n=sc.nextInt();
		float w[]=new float[n];
		float p[]=new float[n];
		float p2[]=new float[n];
		float r[]=new float[n];
		int i;
		System.out.println("Enter the weights: ");
		for(i=0;i<n;i++)
		{
			w[i]=sc.nextFloat();
		}
		System.out.println("Enter the profits: ");
		for(i=0;i<n;i++)
		{
			p[i]=sc.nextFloat();
		}
		for(i=0;i<n;i++)
		{
			p2[i]=p[i];
		}
		for(i=0;i<n;i++)
		{
			r[i]=p[i]/w[i];
		}
		int j,k,l;
		float t1,t2;
		float temp;
		for(i=1;i<n;i++)
		{
			temp=r[i];
			t1=p[i];
			t2=w[i];
			j=i-1;
			while(j>=0&&r[j]<temp)
			{
				r[j+1]=r[j];
				w[j+1]=w[j];
				p[j+1]=p[j];
				j--;
			}
			k=j+1;
			r[k]=temp;
			w[k]=t2;
			p[k]=t1;
		}
		System.out.println("");
		float profit=0;
		for(i=0;i<n;i++)
		{
			if(w[i]<=weight)
			{
				profit=profit+(float)p[i];
				weight=weight-w[i];
				j=0;
				while(p2[j]!=p[i])
				{
					j++;
				}
				p2[j]=0;
				System.out.println("Item "+(j+1)+": "+w[i]+" kgs");
			}
			else if(w[i]>weight&&weight!=0)
			{
				float temp2=weight;
				profit=profit+r[i]*temp2;
				weight=weight-temp2;
				j=0;
				while(p2[j]!=p[i])
				{
					j++;
				}
				p2[j]=0;
				System.out.println("Item "+(j+1)+": "+temp2+" kgs");
			}
		}
		System.out.println("\nThe total profit is: "+profit);
	}
}