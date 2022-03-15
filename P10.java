class P10
{
	public static void main(String args [])
	{	
	    char i,j,k;
	
	     for (i='A';i<='E';i++)
	    {
			for (j='E';j>=i;j--)		
		     {
	           System.out.print(" ");
	         }
			 for (k='E';k>='E';k--)		
		     {
	           System.out.print(k+" ");
	         }
	      System.out.println();
		}
    }
}