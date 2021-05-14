import java.util.*;

class Queens
{
  static int count=0;
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of queens to be placed: ");
    int n=sc.nextInt();
    int a[][]=new int[n][n];
    int b[][]=new int[n][n];
    int i=0,j=-1;
    Queens obj=new Queens();
    obj.place(i, j, n, a);
    System.out.println("\n\nTotal no. of solutions for " + n + " queens is "+count);
    System.out.println("\n\nProgram by Mihir Gandhi B1 1611077");
  }
  
  public void place(int i, int j, int n, int a[][])
  {
    int flag=0,flag2=0,final_flag=0;
    int p=0;
    int k,l,m;
    int u,v;
    int x,y;
	
    for(u=0;u<n;u++)	// u is the column number
    {
      p=0;
      flag=0;
      flag2=0;
      final_flag=0;
      for(v=0;v<n;v++)	
      {
        if(a[v][u]!=0)
        {
          flag2=1;
        }
      }
      if(flag2==0&&u>j)
      {
        p=u;
       for(m=1;m<n;m++)
    {
      k=i+m;
      l=p+m;
      if(k>=0&&k<n&&l>=0&&l<n)
      {
        if(a[k][l]!=0)
        {
          flag=1;
          break;
        }
      }
      k=i-m;
      l=p+m;
      if(k>=0&&k<n&&l>=0&&l<n)
      {
        if(a[k][l]!=0)
        {
          flag=1;
          break;
        }
      }
      k=i+m;
      l=p-m;
      if(k>=0&&k<n&&l>=0&&l<n)
      {
        if(a[k][l]!=0)
        {
          flag=1;
          break;
        }
      }
      k=i-m;
      l=p-m;
      if(k>=0&&k<n&&l>=0&&l<n)
      {
        if(a[k][l]!=0)
        {
          flag=1;
          break;
        }
      }
    }
   }
   else
   {
    continue; 
   }
   if(flag==0)
    {
      a[i][p]=1;
      i++;
      if(i==n)
      {
        count++;
        System.out.print("\nSolution No. "+ count+"\n");
        for(x=0;x<n;x++)
        {
          for(y=0;y<n;y++)
          {
            System.out.print(a[x][y]+" ");
          }
          System.out.print("\n");
        }
      }
      final_flag=1;
      break;
    }
  }
  if(final_flag==1)
  {
    j=-1;
    place(i, j, n, a);
  }
  else
  {
    if(i>0)
    {
    int s=0;
      i--;
    while(a[i][s]!=1)
    {
      s++;
    }
    a[i][s]=0;
    j=s;
    place(i, j, n, a);
  }
  }
  }
  
}