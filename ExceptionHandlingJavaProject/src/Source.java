import java.util.*;
public class Source {

public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int num1,num2,result;
	System.out.println("Enter two numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	try {
		result=num1/num2;
		System.out.println("The result is"+ result);
			
	}
	catch(ArithmeticException ex) {
	    System.out.println(ex.getMessage());
	    System.out.println("Cannot divide by Zero");
	}
	catch(InputMismatchException ex) {
	    System.out.println("Enter correct values");
	}
	finally {
		System.out.println("Bye!");
	}	
	}

}
