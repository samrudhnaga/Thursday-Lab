import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 
	    Scanner sc=new Scanner(System.in);
	    int num=1,i;
	    System.out.println("enter the number");
	    num = sc.nextInt();
	    
	    for(i=1;i<=10;i++)
	    {
	        System.out.println("the table  is "+num+"*"+i+"="+i*num);
	    }
	    }
	}