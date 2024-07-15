
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1= in.nextInt();
		System.out.println("enter num2: ");
		int num2= in.nextInt();
		System.out.println("enter the operators (+,-,*,/): ");
		char op=in.next().charAt(0);
		if(op=='+'){
		    System.out.println(num1+num2);
		}
		else if(op=='-'){
		    System.out.println(num1-num2);
		}
		else if(op=='*'){
		    System.out.println(num1*num2);
		}
		else if(op=='/'){
		    System.out.println(num1/num2);
		}
		else{
		    System.out.println("Invalid");
		}
		
	}
}