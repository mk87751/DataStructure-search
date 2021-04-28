import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class kthSmallestDifference {
	public static void main (String[] args)throws IOException {
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(rd.readLine());
		while(t-->0)
		{
			String[] s=rd.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int k=Integer.parseInt(s[1]);
			s=rd.readLine().split(" ");
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(s[i]);
			}
			Arrays.sort(a);
			int low=0,high=a[n-1]-a[0];
		  while(low<high)
		  {
			  int mid=low+(high-low)/2;
               
			   int count=0;
			   int j=0;
			   for(int i=0;i<n-1;i++)
			   {
				   while(j<n && a[j]-a[i]<=mid)
				   {
					   j++;
				   }
				   count+=j-1-i;
			   }
			   if(count<k)
			   low=mid+1;
			   else
			   high=mid;

		  }
		  System.out.println(low);
		}
		
	}
}