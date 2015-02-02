import java.util.Scanner;
class LargestPrime
{
	public static void main(String args[])
		{
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  value of n:");

		long n=Long.parseLong(sc.nextLine());
		long k=0;
		long f=1;
	
		long c=0;
		
		for(long i=2;i<n;i++)
			{
				if(n%i==0)
					{
				          c=0;
					  k=i;
					  c=k;
					  //System.out.println("the factor or the given no is:"+k);
					 }   
				
				 if(c==2)
				       System.out.println("2 is  a prime factor of"+n);
				 for(long j=2;j<k;j++)
					{
						if(k%j==0)
						{
						f=f+1;			
				        	}
							
						 
					}	
					 
					if(f==1&&f<2&&k>0&&c!=2)
					System.out.println(+k+" is a prime factor of "+n);		
			
			  }
											
		}
}