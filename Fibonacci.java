import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[]){
System.out.println("The fibonacci series....");
Scanner sc=new Scanner(System.in);
System.out.print("Enter the maximum value in Fibonacci series....:");
int n=Integer.parseInt(sc.nextLine());
int i=1,j=1,k=1,s=0;
while(k<=n)
{
//System.out.println();
if(k%2==0)
{
System.out.println(+k);
s=s+k;
}
k=i+j;
i=j;
j=k;

}
System.out.print("The sum of even no's in Fibonacci series uptp 4million is....:"+s);
}
}