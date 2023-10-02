package lab2com.greatlearning.lab.transaction;

public class transaction
{
	public static int targetcheck(int[] transactions, int target)
	{
		int sum=0;
		for(int i=0;i<transactions.length;i++)
		{
			sum +=transactions[i];//sum=sum+1;
			if (sum>=target)
			{
				return i;
			}
	}
		
		return -1;
	}

	public int targetcheckwithsub(int[] transactions, int target)
	{
		//int transaction;
		for(int i=0;i<transactions.length;i++)
		{
			target=target-transactions[i];
	if(target<=0) 
	{
		return i;
	
	}
	}
	return -1;
}
}
