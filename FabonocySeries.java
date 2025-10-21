import java.util.Scanner;
class FabonocySeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Febonocy Term you want : ");
		int term=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=term ;i++ )
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}
