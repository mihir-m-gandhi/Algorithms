import java.util.*;

public class Bell
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter the no. of nodes: ");
	  int n=sc.nextInt();
	   System.out.println("Enter the no. of edges: ");
	  int e=sc.nextInt();
	  int a[][]=new int[n][];
	  int b[][]=new int[n-1][];
	  int i,j,k,l;
	  System.out.println("Enter the edges: ");
	  for(i=0;i<n;i++)
	  {
		a[i]=new int[n];
	  }
	   for(i=0;i<e;i++)
	  {
		a[sc.nextInt()-1][sc.nextInt()-1]=sc.nextInt();
	  }
	  for(i=0;i<n;i++)
	  {
		for(j=0;j<n;j++)
		{
			if(a[i][j]==0&&i!=j)
			{
				a[i][j]=999;
			}
		}
	  }
	  System.out.println("\nThe adjacency matrix is: ");
	  for(i=0;i<n;i++)
	  {
	    for(j=0;j<n;j++)
	    {
	      System.out.print(a[i][j] + " ");
	    }
	    System.out.print("\n");
	  }
	  for(i=0;i<n-1;i++)
	  {
	    b[i]=new int[n];
	  }
	   for(i=0;i<n;i++)
	  {
	     b[0][i]=a[0][i];
	  }
	  System.out.print("\n\nTABLE: \n");
	  for(l=0;l<n;l++)
	    {
	      System.out.print(b[0][l]+" ");
	    }
	  int temp[]=new int[n];
	  int t,t2=0,f;
	  for(i=1;i<n-1;i++)
	  {
	    for(j=0;j<n;j++)
	    {
	       t=b[i-1][j];
	       for(k=0;k<n;k++)
	       {
	         temp[k]=b[i-1][k]+a[k][j];
	         if(k==0)
	         {
	           t2=temp[k];
	         }
	         else if(k>0&&temp[k]<t2)
	         {
	           t2=temp[k];
	         }
	       }
	       f=Math.min(t,t2);
	       b[i][j]=f;
	    }
	    System.out.print("\n");
	    for(l=0;l<n;l++)
	    {
	      System.out.print(b[i][l]+" ");
	    }
	  }
	  System.out.println("\n\nProgram by Mihir Gandhi B1 1611077");
	}
}