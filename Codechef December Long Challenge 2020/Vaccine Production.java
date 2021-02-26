import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
		int d1=sc.nextInt();
		int v1=sc.nextInt();
		int d2=sc.nextInt();
		int v2=sc.nextInt();
		int p=sc.nextInt();
		
		int sum=0;
		int days=0;
		
		if(d1<d2) {
			days=d1-1;
			for(int i=d1;i<d2;i++) {
				days++;
				sum+=v1;
				if(sum>=p)
					break;
			       }
	         }
		else if(d2<d1) {
			days=d2-1;
			for(int i=d2;i<d1;i++) {
				days++;
				sum+=v2;
				if(sum>=p)
					break;
			       }

            }
		else if(d1==d2) {
			days=d1-1;
		}
		if(sum<p) {
			while(sum<p) {
				days++;
				sum=sum+v1+v2;
			}
		}
		System.out.println(days);
	}
}
