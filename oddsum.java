import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num,i,sum=0;
		System.out.println("Please give the number ");
		num= sc.nextInt();
		
		for (i=1;i<=num;i++)
		{
		    if (i%2 != 0)
		    {
		    sum = sum+i;
		    }
		} 
		System.out.println("the odd sum is "+sum);
	}
}