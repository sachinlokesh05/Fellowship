//Date:thursday,10/10/2019
import java.util.Scanner;
public class Factorial{
		static int factorial(int n)
		{
			int count=1;
			while(n!=0)
			{
				count=count*n;
				n--;
			}
			return count;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the n value");
			int n=sc.nextInt();
			int m=factorial(n);
			System.out.println(n+"!"+"="+m);
		}

	}

