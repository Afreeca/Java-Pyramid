package afreeca.interviews.exercises;

import java.util.Scanner;

public class GeneratePyramid {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the number of levels for the pyramid");
		
		int level = input.nextInt();
		
		Pyramid newPyramid = new Pyramid("n", level);
		
		newPyramid.print();
		input.close();
	}

}
