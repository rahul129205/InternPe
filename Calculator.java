import java.util.Scanner;
public class Calculator{ 
public static void main(String args[]) 
{ 
char operator; 
double num1, num2, result; 
Scanner input = new Scanner(System.in); 
System.out.println("Choose operator +, -, *, / ::");
operator = input.next().charAt(0);
switch(operator) 
{ 
case '+': 
System.out.println("Enter first number ::"); 
num1 = input.nextDouble(); 
System.out.println("Enter second number ::"); 
num2 = input.nextDouble(); 
result = num1 + num2; 
System.out.println(num1 + "+" + num2 + "=" + result); 
break; 
case '-': 
System.out.println("Enter first number ::"); 
num1 = input.nextDouble(); 
System.out.println("Enter second number ::"); 
num2 = input.nextDouble(); 
result = num1 - num2; 
System.out.println(num1 + "-" + num2 + "=" + result);
break; 
case '*': 
System.out.println("Enter first number ::");
num1 = input.nextDouble(); 
System.out.println("Enter second number ::");
num2 = input.nextDouble(); 
result = num1 * num2;
System.out.println(num1 + "*" + num2 + "=" + result);
break; 
case '/': 
System.out.println("Enter first number ::");
num1 = input.nextDouble(); 
System.out.println("Enter second number ::");
num2 = input.nextDouble(); 
result = num1 / num2; 
System.out.println(num1 + "/" + num2 + "=" + result);
break; 
default:
System.out.println("Invalid character"); 
break; 
} 
input.close(); 
 
} 
}