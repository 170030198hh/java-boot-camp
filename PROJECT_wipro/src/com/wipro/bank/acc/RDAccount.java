package com.wipro.bank.acc;

public class RDAccount extends Account
{
	
	public RDAccount(int tenure, float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}
	public float calculateAmountDeposited()
	{
		return (principal*tenure*12);
		
	}
	public float calculateInterest() 
	{
		float P=principal;
		float  r= rateOfInterest/100;
		int n=4;
		int tn=tenure*12;
		int t=60;
		int i;
		int nt;
		for(i=0;i<60;i++)
		{
			
		return P*((Math.pow(1+r/n, r),n*((nt-i)/12.0))-1)f;	
		
		
		
	}
}
}

