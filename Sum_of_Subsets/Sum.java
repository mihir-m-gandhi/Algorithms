import java.util.*;

class Sum
{
  static int total,n,v[],a[],sum;
  
  public static void main(String[] args)
  {
	Sum m=new Sum();
	Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number of elements: ");
    n=sc.nextInt();
    a=new int[n];
    v=new int[n];
    System.out.println("Enter the sum to be obtained: ");
    total=sc.nextInt();
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		sum=sum+a[i];
	}
	m.sub(0,0,sum);
	System.out.print("\n\nProgram by Mihir Gandhi B1 1611077\n");
  }
  
  void sub(int s,int l,int rs)
  {
	v[l]=1;
	if(a[l]+s==total)
	{
		System.out.print("The subset is: ");
		for(int k=0;k<=l;k++)
		{
			if(v[k]==1)
			{
				System.out.print(a[k]+" ");
			}
		}
		System.out.println();
	}
    else if(s+a[l]+a[l+1]<=total)
    {
		sub(s+a[l],l+1,rs-a[l]);
    }
    if(s+rs-a[l]>=total && s+a[l+1]<=total)
    {
		v[l]=0;
		sub(s,l+1,rs-a[l]);
	}
  }
}