
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long t =sc.nextLong();
		while(t-->0) {
			long n =sc.nextLong();
			long  d=sc.nextLong();
			int n1=0,n2=0;
			long[] arr = new long[(int)n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				if(arr[i] <=9 || arr[i]>=80)
					n1++;
				else
				    n2++;
			}

			long ans = (long) (Math.ceil((double)n1/(double)d) + Math.ceil((double)n2/(double)d));
			System.out.println(ans);
		}
	}
}
