import java.util.*;
public class MergeSort
{
    static int count=0;
    public static void main(String args[])
    {
        int n=10;
        int arr[]=new int[n];
        int i;

        Random r=new Random();
        for(i=0;i<n;i++)
            arr[i]=r.nextInt(50);
        System.out.print("\nBefore Sorting:");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");    

        MergeSort ob=new MergeSort();long t1=System.nanoTime();
        ob.mergesort(arr,0,n-1);long t2=System.nanoTime();
        System.out.print("\nAfter Sorting:");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nCount="+count);
    }

    void mergesort(int a[],int p,int r)
    {
        count++;
        if(p<r)
        {
            int q=(p+r)/2;count++;

            mergesort(a,p,q);
            mergesort(a,q+1,r);

            merge(a,p,q,r);
        }
    }

    void merge(int a[],int p,int q,int r)
    {
        int n1,n2;
        n1 = q-p+1;
        n2 = r-q ;        
        count=count+1;
        
        int L[]= new int [n1];
        int R[]= new int [n2];
        
        for(int i=0;i<n1;i++,count=count+1)
        {
            L[i] = a[p+i]; 
        }	
        for(int i=0;i<n2;i++,count=count+1)
        {
            R[i] = a[q+i+1];
        }
        
        int i=0,j=0;
        count=count+1;
        while(i<n1 && j<n2)
        {	count=count+1;
            if(L[i]<R[j])
            {
                count=count+1;
                a[p++]=L[i];
                i++;
            }
            else
            {	count=count+1;
                a[p++]=R[j];
                j++;
            }
        }
        count=count+1;
        
        while(i<n1)
        {
            count=count+1;
            a[p++]=L[i++];	
        }
        count=count+1;
        while(j<n2)
        {
            count=count+1;
            a[p++]=R[j++];
        }
    }
}
