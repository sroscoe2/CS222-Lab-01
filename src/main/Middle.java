package main;

public class Middle {

	public static void for1thru10() {
		for (int i=1; i<11; i++) {
			System.out.println(i);
		}
		/*
		 *  TODO What are the corresponding code snippets for the for loop?
		 * 	initialization:
		 * 
		 *  condition:
		 *  
		 *  update:
		 *  
		 */
         
	}
	
	public static int forSum(int[] arr) {
		// TODO write a for loop that finds the sum of elements in the array
		/*
		 * TODO Write what the steps are to find the sum of 
		 * an array of length n.
		 * 
		 * initialization:	
		 * 
		 * condition:		
		 * 
		 * update: 			
		 * 
		 * How to keep track of sum as we go? 
		 * 
		 */
		
		// TODO change 0 to something else
		return 0;
	}
	
	public static void while1thru10() {
		int i=1;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		/*
		 * TODO: answer the following questions.
		 * 
		 *  1. TODO What are the corresponding code snippets for the for loop?
		 * 	initialization:
		 * 
		 *  condition:
		 *  
		 *  update:
		 * 
		 *  2. TODO How are the initialization/condition/update steps different
		 *  from for1thru10()? 
		 *  
		 *   
		 */

		
	}
	
	public static int whileSum(int[] arr) {
		// TODO write a while loop that finds the sum of elements in the array
		/*
		 * TODO Write what the steps are to find the sum of 
		 * an array of length n.
		 * 
		 * initialization:	
		 * 
		 * condition:		
		 * 
		 * update: 			
		 * 
		 * How to keep track of sum as we go? 
		 * 
		 */

		
		// TODO change 0 to something else
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for1thru10();
		
		// array used for testing
		int[] arr = {5,62,69,60,24,47,11,90,99,82};
		// sum should be 549
		
		System.out.printf("Sum of array: %d\n",forSum(arr));
 
		
		while1thru10();
		System.out.printf("Sum of array: %d\n",whileSum(arr));
	}

}
