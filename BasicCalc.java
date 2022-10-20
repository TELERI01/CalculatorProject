package CS103Class;

import java.text.Format;
import java.text.NumberFormat;
import java.util.*;

public class BasicCalc {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		float a,b,res = 0;
		
		double c;
		
		char choice, ch;
		
		NumberFormat nf1 = NumberFormat.getPercentInstance();
		
		do {
		//prepare the menu for user
			System.out.println("\n\nMain Menu: \n1.Addition\n2.Subtraction" + "\n3.Multiplication\n4.Division\n5.Sin\n6.Cos\n7.Tan\n8.Asin\n9.Acos\n10.ATan" +
		"n11.Exp - E\\n12.Log - l\\n13.Sqrt - r\n14.Percent - p\n15.Exponent - ^\n16.Euler - e\n17.Pi - ~\n18.Maximum - M\n19.min - m\n20.quit - q");
			
			System.out.println("Enter your choice: ");
			choice = scan.next().charAt(0);
			
			switch(choice) {
			
			case '1':
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a+b;
				System.out.println("Result: " + res);
				break;
			case '2':
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a-b;
				System.out.println("Result: " + res);
				break;
			case '3':	
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a*b;
				System.out.println("Result: " + res);
				break;
			case '4':	
				System.out.println("Enter two numbers: ");
				a = scan.nextFloat();
				b = scan.nextFloat();
				res = a/b;
				System.out.println("Result: " + res);
				break;
			case '5':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				res = (float) Math.sin(a);
				System.out.println("Result: " + res);
				break;
			case '6':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				res = (float) Math.cos(a);
				System.out.println("Result: " + res);
				break;
			case '7':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				res = (float) Math.tan(a);
				System.out.println("Result: " + res);
				break;
			case 's':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				c = Math.toRadians(a);
				res = (float) Math.asin(c);
				System.out.println("Result: " + res);
				break;
			case 'c':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				c = Math.toRadians(a);
				res = (float) Math.acos(c);
				System.out.println("Result: " + res);
				break;
			case 't':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				c = Math.toRadians(a);
				res = (float) Math.atan(a);
				System.out.println("Result: " + res);
				break;
			case 'e':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				System.out.println("Enter a exponent: ");
				b = scan.nextFloat();
				res =(float) Math.pow(a, b);
				System.out.println("Result: " + res);
				break;
			case 'l':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				System.out.println("Enter the next number: ");
				b = scan.nextFloat();
				res = (float) Math.log(a);
				break;
			case 'r':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				res = (float) Math.sqrt(a);
				System.out.println("Result: " + res);
				break;
				
			case 'p':
				System.out.println("Enter a quantity : ");
				a = scan.nextFloat();
				System.out.println("Enter a total: ");
				b = scan.nextFloat();
				res = (a/b);
				System.out.println("Result: " + nf1.format(res));
				break;
				
			case '^':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				res = (float) Math.pow(a, 2);
				System.out.println("Result: " +res);
				break;
				
			case 'u':
				System.out.println("Enter a number: ");
				a = scan.nextFloat();
				double e = 2.7182818284590452353602874713527;
				res = (float) ((double) a*e) ; 
				System.out.println("Result: " + res);
				
			case '~':
				System.out.println("Enter a number");
				a = scan.nextFloat();
				double pi = 3.14;
				res = (float) ((float) a*pi);
				System.out.println("Result: " + res);
				
			case 'M':
				System.out.println("Enter 4 numbers: ");
				int num1, num2, num3, max = 0;
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				num3 = scan.nextInt();
				if (num1>num2 && num1>num3)
					max=num3;
			else if (num2>num3)
				max= num2;
			else
				max=num3;
			System.out.println("Result:" + max);
				break;
	
			case 'm':
				System.out.println("Enter ");
				System.out.println("Enter 4 numbers: ");
				int nume1, nume2, nume3, min = 0;
				nume1 = scan.nextInt();
				nume2 = scan.nextInt();
				nume3 = scan.nextInt();
				if (nume1<nume2 && nume1<nume3)
					min=nume3;
			else if (nume2<nume3)
				min= nume2;
			else
				min=nume3;
			System.out.println("Result: " + min);
				break;
			
				
			case 'q':
				System.exit(0);
				break;
			
			default:
				System.out.println("Choice is invalid.");
				break;
				
			}
				
		}
		while(choice!='q');

	}

}
