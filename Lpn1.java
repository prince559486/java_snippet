import java.util.Scanner;
class Lpn1
{
	public static void main(String args[])
		{
	
		long number=1;
		long count=0;
		outerLoop:while (number>0){
		innerLoop:for(long i=1;i<=10;i++)
		{
		  if(number%i!=0){
		   break innerLoop;  
		    }
		  else {
		 count=count+1;
		}  
		}

		   if(count<10)	{
		     count=0;
		      number++;
		   }
		   if(count==10)
		{
		System.out.println("hi");
		System.out.println(+number);
		     break outerLoop;
		}
		}

		
   }

}			
		