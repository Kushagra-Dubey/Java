import java.io.*;
import java.util.*;

class Solution {
	 static class FastReader
		{
		    BufferedReader br;
		    StringTokenizer st;

		    public FastReader()
		    {
		        br = new BufferedReader(new InputStreamReader(System.in));
		    }

		    String next()
		    {
		        while (st == null || !st.hasMoreElements())
		        {
		            try
		            {
		                st = new StringTokenizer(br.readLine());
		            }
		            catch (IOException  e)
		            {
		                e.printStackTrace();
		            }
		        }
		        return st.nextToken();
		    }

		    int nextInt()
		    {
		        return Integer.parseInt(next());
		    }

		    long nextLong()
		    {
		        return Long.parseLong(next());
		    }

		    double nextDouble()
		    {
		        return Double.parseDouble(next());
		    }

		    String nextLine()
		    {
		        String str = "";
		        try
		        {
		            str = br.readLine();
		        }
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        }
		        return str;
		    }
		}
		
		public static void main(String[] args) throws Exception {
				FastReader fr = new FastReader();
				PrintWriter pw = new PrintWriter(System.out,true);
				int t = fr.nextInt();
				while(t-->0) {
					int n = fr.nextInt();
					long x = fr.nextLong();
					long[] a = new long[n+1];
					for(int i=1;i<=n;i++) {
						a[i]=fr.nextLong();
					}
					int x1=0,p=0;
					long z=x;
				// 	if(x<=50000000*n && n==2) {
				// 		while(x-->0) {
							
				// 			if(a[1]==0)
				// 				p=1;
							
				// 			else {
	   //  					p = (int)(Math.log(a[1])/Math.log(2));
	   //  					p=(int)Math.pow(2, p);
				// 			}
				// 			a[1]=p^a[1];
				// 			a[2]=p^a[2];
				// 			x1++;
				// 			}
				// 	}
				// 	else 
				if(n==2 ) {	
					while(x-->0) {
						
						if(a[1]==0)
							break;
						
						else {
     					p = (int)(Math.log(a[1])/Math.log(2));
     					p=(int)Math.pow(2, p);
						}
						a[1]=p^a[1];
						a[2]=p^a[2];
						x1++;
						}
					if((z-x1)%2==1)
					{
						a[1]=1^a[1];
						a[2]=1^a[2];
					}
						
					}
					else {
					for(int i=1;i<n;i++) {
						while(a[i]!=0) {
							if(x1>=x)
								break;
							x1++;
							p=(int)(Math.log(a[i])/Math.log(2));
							p=(int)Math.pow(2,p);
						
						a[i]=a[i]^p;
						
						boolean found = false;
						for(int j=i+1;j<=n;j++) {
							long y=a[j]^p;
							if(y<a[j]) {
								a[j]=y;
								found=true;
								break;
							}
						}
						if(found==false)
							a[n]=a[n]^p;
					}
					}
					}	
					for(int i=1;i<=n;i++) {
						pw.print(a[i]+" ");
					}
					pw.println("");
				}
				
	}
}
