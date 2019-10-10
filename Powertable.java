//Date:thursday,10/10/2019
import java.util.Scanner;

public class Power {
	static void pow(int n,int p)
	{
		int pw=1;
		int i=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
			System.out.println(n+"^"+i+":"+pw);
			i++;
		}
		}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Nth value");
	pow(2,sc.nextInt());
	System.out.println();
}
}
