import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num,i,product=1;
		System.out.println("Please give the number ");
		num= sc.nextInt();
		
		for (i=1;i<=num;i++)
		{
		    product = product*i;
		} 
		System.out.println("the product is "+product);
	}
}