import java.util.Scanner;
class Multiple
{
public static void main(String args[]){
//System.out.printl("Welcome to the world of coding");
Scanner sc=new Scanner(System.in);
System.out.print("Enter the max value of n:");
int n=Integer.parseInt(sc.nextLine());
int s=0;
for(int i=1;i<n;i++)
{

if(i%3==0||i%5==0)
{
System.out.println(+i);
s=s+i;
}
}
System.out.println("The sum of all mulitples of 3 and 5 below 1000 are :"+s);

}
}