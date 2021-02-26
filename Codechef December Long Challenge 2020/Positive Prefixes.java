import java.io.*;
import java.util.StringTokenizer;

 class Codeshef {
	
	
	public static class FastReader
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
		PrintWriter pw = new PrintWriter(System.out,true);
		FastReader fr = new FastReader();
		int t=fr.nextInt();
		while(t-->0) {
			int n=fr.nextInt();
			int k=fr.nextInt();
			int[] a = new int[n+1];
			for(int i=1;i<=n;i++) {
				a[i]=i;
			}
			if(n!=k) {
			int x = 2*k-1;
			if(x<=n) {
				int i=1;
			for(;i<=x;i++) {
				if(a[i]%2==0)
					a[i]=-a[i];
			}
			for(;i<=n;i++) {
				a[i]=-a[i];
			}
			}
			else {
				x=x-n;
				for(int i=1;i<=n-x;i++) {
					if(a[i]%2==0)
						a[i]=-a[i];
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
