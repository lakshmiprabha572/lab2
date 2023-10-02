package lab2com.greatlearning.lab.transaction;

import java.util.Scanner;

public class main {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println(Integer.MAX_VALUE);
	System.out.println("enter the size of transaction array");
	int size=sc.nextInt();
			int[]transactions=new int[size];
	System.out.println("enter the size of transaction ");
	for(int i=0;i<size;i++)
	{
		transactions[i]=sc.nextInt();
	}
	System.out.println("enter the number of target needs to be checked");
	int targetsize=sc.nextInt();
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the target value");
		int target=sc.nextInt();
		int res=transaction.targetcheck(transactions,target);
		if(res>=0)
		{System.out.println("target can be achieved after"+(int)(res+1) +"transactions");
		}else
		{
			System.out.println("target cannot be acheived");
		}
		
	}
	
	
}
		
}
