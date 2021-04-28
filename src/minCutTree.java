import java.util.*;
import java.io.*;
public class minCutTree {
    public static int findSum(int[] a,int mid , int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>mid)
            sum+=a[i]-mid;
        }
        return sum;
    }
    public static int binarySearch(int[] a,int n,int k)
    {
        int low=1,high=100000,mid=0;
        while(low<high)
        {
            mid=low+(high-low)/2;
            int m=findSum(a,mid,n);
            if(m==k)
            return mid;
            else if(m<k)
            high=mid;
            else
            low=mid+1;
        }
        return low;
    }
    public static void main(String[] args)throws IOException
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println(binarySearch(a,n,k));
        scan.close();
    }
}
