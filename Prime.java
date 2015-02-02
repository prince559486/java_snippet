import java.util.Scanner;
class Prime
{
public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  value of n:");

		int n=Integer.parseInt(sc.nextLine());

		int f=0;
		for(int i=2;i<n/2;i++)
			{
					if(n%i==0)
					{
						f=1;
					}
			}

		if(f==1)
			System.out.println(+n+"  is not a prime number");
		else
			System.out.println(+n+"  is a prime number");

	}
}