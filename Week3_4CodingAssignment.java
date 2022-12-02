package week4;

import java.util.Arrays;

public class Week3_4CodingAssignment {

	public static void main(String[] args) {
		//Int Array Question # 1
		
		int[]ages = {3,9,23,64,2,8,28,93,75};
		
		//double Array for question #11 & # 13
		double[] doubleArray = {45.5, 33.2, 97.9, 75.6};
		double [] newDoubleArray = {45.6, 33.2, 97.9, 75.6};
		{
			System.out.println("Last number in the array minus the first number in the array: " + ((ages [ages.length-1]) - ages[0]));
		}
		int[] newArray = {100};
		int agesLength = ages.length;
		int newArrayLength = newArray.length;
		int[] result = new int [agesLength + newArrayLength];
		System.arraycopy(ages, 0, result, 0, agesLength);
		System.arraycopy(newArray,0, result, agesLength, newArrayLength);
		
			{
				System.out.println("Last number in the new array - the first number in the new array: " + ((result [result.length-1]) - result[0]));
				
			}
		{
			double sum = 0;
			for (int array : result)
			{
				sum += array;
			}
			System.out.println("Average age in the New Array: " + (sum / result.length));
			}
		//String Array : Question # 2
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sumOfLetters=0;
		for (String name:names)
		{
			sumOfLetters += name.length();
		}
		System.out.println("Average number of letters per name: " + (sumOfLetters)/names.length);
				for (int i=0; i<names.length; i++)
		{
						System.out.println(names[i] + " ");
						
		}
		
		//#5 - Create an array nameLengths - iterate over previous and add name length to previous list of names
		 int [] nameLengths = new int [names.length];
		 for (int j=0; j<names.length; j++)
			 nameLengths [j] = names[j].length();
		 {
			 System.out.println(Arrays.toString(nameLengths));
		 }
			int sumNameLengths = 0;
			for (int nameLength : nameLengths)
			{
				sumNameLengths += nameLength;
			}
			
						
				System.out.println(sumNameLengths);
						
// 7. Print to console methods
						
		System.out.println(multiplyString("Hello ",3));
		System.out.println(fullName("Tricia", "Sewell"));
		System.out.println(greaterThan(ages));
		System.out.println(myAverage(ages));
		System.out.println(whichIsGreater(doubleArray, newDoubleArray));
		System.out.println(willBuyDrink(true, 11.50));
		System.out.println(passSecondGrade (true, doubleArray));
	}
	// 7. Write a method that takes a string, word, and an int, n, as arguments and returns the word concatenated to itself n times.
		public static String multiplyString (String str, int num)
		{
			String result = "";
			for (int i=0; i<num; i++)
			{
				result += str;
						
			}return result;}
			
	// 8. Write a method that combines first and last name	
		public static String fullName (String x, String y)
		{
			return x + " " + y;
		}
		
		
		// 9. Write a method that returns true
		public static Boolean greaterThan (int[] numbers)
		{
			int sum = 0;
			for (int number:numbers){
				sum += number;
			} if (sum>100) {
			return true;
			}else
			{return false;
			}}
		// 10. Write a method double that returns the average of an array
		public static double myAverage (int[] numbers)
		{
			int sum = 0;
			for (int number:numbers) {
				sum+= number;
			}return sum/numbers.length;}
		
		//  11.	Write a method that takes two arrays of double and returns 
		//true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static boolean whichIsGreater (double[] numbers, double[] newNumbers)
		{
			double sum1 = 0;
			for (double number:numbers) {
				sum1+=number;
			}double sum2 = 0;
			for (double newNumber : newNumbers) {
				sum2 += newNumber;
			}if ((sum1/numbers.length)>(sum2/newNumbers.length)){
			return true;	
			}else {
				return false;
			}}
			//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
			//and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			}else
			{
				return false;
			}}
			
		// 13.  The method passSecond grade takes a boolean that is true if a student is reading at grade level and a double
		//    	checks the average test score of a student. It will return true if a student is reading at grade level and their average
		// 		test score is greater than 50 percent.  I created it to determine whether or not a student will pass second grade.
		
		public static boolean passSecondGrade (boolean readingAtGradeLevel, double averageTestScores[])
			{
				double sum = 0;
				for (double averageTestScore: averageTestScores) {
					sum+=averageTestScore;
				}if (sum/averageTestScores.length>50 && readingAtGradeLevel ==true)
				{
					return true;}
				else {
					return false;
				}
			}
		}
		
		
			

	
		
			


			
				
		
			
					
	

		
		
			
		
			
		
		
			
		
	
	


