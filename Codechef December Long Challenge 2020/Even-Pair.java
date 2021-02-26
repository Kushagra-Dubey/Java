import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long a=sc.nextInt();
			long b=sc.nextInt();
			long even1 = a/2;
			long odd1=a-even1;
			long even2=b/2;
			long odd2=b-even2;
			
			long ans = even1*even2 +odd1*odd2;
			System.out.println(ans);
			
   }
	}
}
