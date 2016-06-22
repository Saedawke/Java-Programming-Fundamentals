/**
* Java Programming Fundamentals
* 1. Write a program that prompts the user to input length, width, and height of a box.
	 The program then outputs the surface area and Volume.

* HINT: Surface Area or SA = 2((Length * Width) + (Length * height)  + (height * Width));
* HINT2: in Short SA = SA = 2(lw + hl + hw);
* HINT3: Volume of the box V = (Length * Width * Height);
*/
import java.util.Scanner;
public class Sol2{
	public static void main(String[] args){
		//Declare all needed Variables in this case Length, Width & Height, SA, and Volume.
		double l, w, h, sa, v;
		
		//Instanciate Scanner input Object
		Scanner input = new Scanner(System.in);
		
		//Ask user to input Length;
		System.out.print("Enter Box Length: ");
		//Accept Length value;
		l = input.nextDouble();
		
		//ask to input Width
		System.out.print("Enter Box Width: ");
		//Accept Width value;
		w =  input.nextDouble();
		
		//ask to input Height
		System.out.print("Enter Box Height: ");
		//Accept Height value;
		h =  input.nextDouble();
		
		//Calculate Surface Area using the information user provided;
		sa = ((l * w) + (l * h) + (h * w));
		v = l * w * h;
		  
		  //Display the Fahrenheit to the Console;
		  System.out.println("Surface Area of the Box is: \t "+sa+" \nVolume of the box is: \t\t "+v);
		  
	}
}
