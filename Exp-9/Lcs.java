import java.util.*;

class Lcs 
{
  static int q=0;
  
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String sa=sc.nextLine();
    System.out.println("Enter test string: ");
    String sb=sc.next();
    String s1=sa.toLowerCase();
    String s2=sb.toLowerCase();
    int m=s1.length();
    int n=s2.length();
    char a[]=s1.toCharArray();
    char b[]=s2.toCharArray();
    int x[][]=new int[m+1][n+1];
    int i,j;
    for(i=0;i<n;i++)
    {
      x[0][i]=0;
    }
    for(i=0;i<m;i++)
    {
      x[i][0]=0;
    }
    for(i=1;i<=m;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(a[i-1]==b[j-1])
        {
          x[i][j]=x[i-1][j-1]+1;
        }
        else
        {
          x[i][j]=Math.max(x[i-1][j],x[i][j-1]);
        }
      }
    }
    System.out.print("\n\n");
    for(i=0;i<=m;i++)
    {
      for(j=0;j<=n;j++)
      {
        System.out.print(x[i][j]+" ");
      }
      System.out.print("\n");
    }
  char lcs[][]=new char[100][Math.min(m,n)];
  System.out.print("\n\nLCS is: \n");
  i=m;
  j=n;
  int k=0;
  int l=0;
  again(x,a,i,j,k,l,lcs);
  i=0;
  while(lcs[0][i]!='\u0000')
  {
    i++;
  }
  while(i>=1)
  {
    System.out.print(lcs[0][i-1]);
    i--;
  }
  for(i=1;i<=q;i++)
  {
    System.out.print("\n");
    j=0;
    while(lcs[i][j]=='\u0000')
    {
      j++;
    }
    System.out.print(lcs[i][j]);
    while(j>=0)
    {
      if(j!=0)
      {
        if(lcs[i][j-1]=='\u0000')
        {
          j--;
          i--;
        }
        else
        {
          j--;
        }
        System.out.print(lcs[i][j]);
      }
      else
      {
        System.exit(1);
      }
    }
  }
  System.out.print("\n\nProgram By Mihir Gandhi B1 1611077 \n");
}

  public static void again(int x[][], char a[], int i, int j, int k,int l, char lcs[][])
  {
    if(i>0&&j>0)
    {
    if(x[i][j]==x[i-1][j]&&x[i][j-1]==x[i][j])
    {
      again(x,a,i-1,j,k,l,lcs);
      l++;
      q++;
      again(x,a,i,j-1,k,l,lcs);
    }
    else 
    {
      if(x[i][j]==x[i-1][j])
    {
      again(x,a,i-1,j,k,l,lcs);
    }
    else if(x[i][j]==x[i][j-1])
    {
      again(x,a,i,j-1,k,l,lcs);
    }
    else
    {
      lcs[l][k]=a[i-1];
      k++;
      again(x,a,i-1,j-1,k,l,lcs);
    }
    }
    }
  }
}