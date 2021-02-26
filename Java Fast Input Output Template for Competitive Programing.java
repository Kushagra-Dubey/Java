package Codeshef;
import java.io.*;
import java.util.StringTokenizer;

public class FastInputOutput {
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

}
}
