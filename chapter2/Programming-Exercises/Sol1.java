/**
* Java Programming Fundamentals
* 1. Write a program that prompts the user to inputer temperature in Centigrade. 
	 The program should then output the temperature in Fahrenheit.

* HINT: to convert Centigrade to Fahrenheit: Multiply the celcius value by 9, then divide by 5, then add 32
* HINT2: to convert Fahrenheit to Centigrade: Deduct 32 the Fahrenheit value, then multiply by 5, then divide by 9
*/
import java.util.Scanner;
public class Sol1{
	public static void main(String[] args){
		//Instanciate Scanner input Object
		Scanner input = new Scanner(System.in);
		
		//Ask user to input data;
		System.out.print("Enter Centigrade: ");
		
		/*Accept only Numeric value preferable Double 
		  there is uncought exception which this chapter considering*/
		  double celcius = input.nextDouble();
		  double fahrenheit = (celcius * 9 / 5 ) + 32;
		  
		  //Display the Fahrenheit to the Console;
		  System.out.printf("%5.2f Centigrade is %5.2f Fahrenheit ", celcius, fahrenheit);
		  
	}
}
