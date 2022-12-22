import java.util.Scanner;
public class Multiplication
{
	public static void main(String[] args) {
	    int num;
	    Scanner sc=new Scanner(System.in);
		System.out.println("please give the number to check");
		num = sc.nextInt();
		
		if((num%4==0) && (num%11==0))
		{
		    	System.out.println("the number"+num+"is divisible by 4 and 11");
		}
		else{
		    	System.out.println("the number"+num+"is not divisible by 4 and 11");
		    
		}
	}
}