package com.greatlearning.currency;

import java.util.Scanner;

public class main {
			
public static void main(String[] args)

{
Scanner sc=new Scanner(System.in);
	 
	System.out.println("enter the size of currency denominations:");
	int size=sc.nextInt();
	//System.out.println("enter the currency denominations value");
	int[] denominations=new int[size];
	
	System.out.println("enter the currency denominations value");
	for(int i=0;i<size;i++) {
		denominations[i] = sc.nextInt(); 
	}
	System.out.println("enter the amount u want to pay");
	int payvalue=sc.nextInt();
	
	mergesort sort=new mergesort();
	sort.sort(denominations, 0, denominations.length-1);
	
	currency curr = new currency();
	curr.currencycount(denominations,payvalue);
	//currency.noofnotes =new currency();
	//currency.noofnotes(denominations,amount);
	sc.close();
	
	
	//System.out.println();
	
	}
}