package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Treasure = {"Jisoo","Jennie","Blink","Rosé","Lisa"};
		//2. print the third element in the array
		System.out.println(Treasure[2]);
		//3. set the third element to a different value
		Treasure[2] = "BlackPink";
		//4. print the third element again
		System.out.println(Treasure[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int i = 0; i < Treasure.length; i = i+1) {
			System.out.println(Treasure[i]);
		}
		System.out.println("...");
		//for each loop http://central.jointheleague.org/levels/Level2/Mod0Recipes/arrays.html
		for (String name : Treasure) {
		     System.out.println(Treasure);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < nums.length; i = i+1) {
			Random randy = new Random();
			//ask for help on this step
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
