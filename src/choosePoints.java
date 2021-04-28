import java.util.*;
import java.io.*;
public class choosePoints {
    public static int binarySearch(int i,int[] a,int k)
    {
        int low=i,high=a.length-1,mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(a[mid]-a[i]==k)
            return mid;
            else if(a[mid]-a[i]>k)
            high=mid-1;
            else
            low=mid+1;
        }
        return high;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int x=binarySearch(i,a,k);
            x=x-i+1;
            x-=2;
            sum+=x*(x+1)/2;
        }
        System.out.println(sum);
        scan.close();

    }
}
