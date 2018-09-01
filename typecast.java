import java.util.Scanner;
class main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String n1=scan.nextLine();
		int res1=Integer.parseInt(n1);
		String n2=scan.nextLine();
		int res2=Integer.parseInt(n2);
		System.out.println("number1 after conversion: "+res1);
		System.out.println("number2 after conversion: "+res2);
		if (res1>res2)
		{
			System.out.println(res1+"is maximum");
		}
		else
		{
			System.out.println(res2+" is maximum");
		}
	}
}