package Chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitiu_1 {

	public static void main(String[] args) throws IOException {
		

	String initial_value = readString();
	System.out.println("Show inserted string  " + initial_value);
	
	Integer lenght_string = initial_value.length();
	System.out.println("Lenght of the string " + lenght_string);
	
	char array_of_char[] = new char[lenght_string];
	
	initial_value.getChars(0, lenght_string, array_of_char, 0);

	for (int i = 0; i < array_of_char.length; i++) {
	      System.out.print(array_of_char[i] + " ");
	   }
	
	}

	
	
	public static String readString() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your STRING : ");
		String input_string = br.readLine();
		return input_string;
	}
	
	
}
