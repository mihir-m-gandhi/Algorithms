import java.util.*;

class Ins77
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int i,j,temp,count=0;
		System.out.print("Enter the no. of inputs: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=rand.nextInt(100);
		}
		for(i=1;i<n;i++) 
		{		
		    temp=a[i];
		    j=i-1;
		    while (j>=0&&a[j]>temp)
           	    {
                      a[j+1]=a[j];
		      count++;
                      j=j-1;
            	    }
                    a[j+1]=temp;
	        }
		System.out.println("\nNo. of swaps is "+count);
	}
}