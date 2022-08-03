package practice_project_4;

public class LongestIncreasingSequence 
{

	public static void main(String[] args)
	{
		 int[] n = {5,8,9,2,6,8,10};
		 printLIS(n);
		 }
	public static void printLIS(int[] n)
	{
		String[] path = new String[n.length];
		int[] size = new int[n.length];
			
		for(int i=0; i<n.length; i++)
		{
			size[i] = 1;
			path[i] = n[i] + " " ;
		}

		//Creating maxLenth to keep track
		int maxLength = 1; 

		for(int i=1; i<n.length; i++)
		{ 
			for(int j=0; j<n.length; j++)
			{
		
				if(n[i]>n[j] && size[i] < size[j] + 1){;
			
			size[i] = size[j] + 1;
			path[i] = path[j] + n[i] + " "; 
			
			if(maxLength < size[i])
				maxLength = size[i];
			}
		   }
		}

		  for(int i=1; i<n.length; i++){
		    if(size[i] == maxLength)
		    {
		    	System.out.println("The Length of Longest Increasing Subsequence = " +maxLength);
			    System.out.println("LIS: " + path[i]);
		    }
		  }
		 }

}
