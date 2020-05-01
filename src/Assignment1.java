
public class Assignment1 {
	public static void main(String[] args) {
	
//1 Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		

//		int[] ages = new int[8];
//		
//		ages[0] = 3;
//		ages[1] = 9;
//		ages[2] = 23;
//		ages[3] = 64;
//		ages[4] = 2;
//		ages[5] = 8;
//		ages[6] = 28;
//		ages[7] = 93;
//		
		//a Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		
//		int[] ages = new int[8];
//		
//		ages[0] = 9;
//		ages[1] = 23;
//		ages[2] = 64;
//		ages[3] = 2;
//		ages[4] = 8;
//		ages[5] = 28;
//		ages[6] = 93;
//		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);	
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
//		System.out.println(ages[5]);
//		System.out.println(ages[6]);

		//b Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
//		int[] ages = new int[7];
//		
//		ages[0] = 23;
//		ages[1] = 64;
//		ages[2] = 2;
//		ages[3] = 8;
//		ages[4] = 28;
//		ages[5] = 93;
//		ages[6] = 69;
//		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);	
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
//		System.out.println(ages[5]);
//		System.out.println(ages[6]);
		
		
		//c Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//		
//		int[] ages = new int[7];
//		
//		ages[0] = 23;
//		ages[1] = 64;
//		ages[2] = 2;
//		ages[3] = 8;
//		ages[4] = 28;
//		ages[5] = 93;
//		ages[6] = 69;
//		
//		
//		int sumOfAges = 0;
//		for (int i = 0; i < ages.length; i++)
//			sumOfAges = sumOfAges + ages[i];
//			double average = sumOfAges / ages.length;
//		System.out.println("Average value of array elements is: " + average);
//		
		
//2 Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.		
		
//String[] names = new String[6];
//	
//		names[0] = "Sam";
//		names[1] = "Tommy";
//		names[2] = "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob";

		//a Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
//String[] names = new String[6];
//		
//		names[0] = "Sam";
//		names[1] = "Tommy";
//		names[2] = "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob";
//
//		int count0 = 0;
//		int count1 = 0;
//		int count2 = 0;
//		int count3 = 0;
//		int count4 = 0;
//		int count5 = 0;
//		
//		for (int i = 0; i < names[0].length(); i++) {
//			if (names[0].charAt(i) != ' ')
//				count0++;
//		}
//		for (int i = 0; i < names[1].length(); i++) {
//			if (names[1].charAt(i) != ' ')
//				count1++;
//		}for (int i = 0; i < names[2].length(); i++) {
//			if (names[2].charAt(i) != ' ')
//				count2++;
//		}for (int i = 0; i < names[3].length(); i++) {
//			if (names[3].charAt(i) != ' ')
//				count3++;
//		}for (int i = 0; i < names[4].length(); i++) {
//			if (names[4].charAt(i) != ' ')
//				count4++;
//		}for (int i = 0; i < names[5].length(); i++) {
//			if (names[5].charAt(i) != ' ')
//				count5++;
//		}
//		
//		int values[] = {count0, count1, count2, count3, count4, count5};
//
//		int sum = 0;
//		for (int i = 0; i < values.length; i++)
//		    sum += values[i];
//
//		double average = ((double) sum) / values.length;
//		System.out.println(average);

		//b Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

//String[] names = new String[6];
//		
//		names[0] = "Sam";
//		names[1] = "Tommy";
//		names[2] = "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob";

//		for (String name : names) {
//			System.out.print(name + ", ");
//	}
		
//3 How do you access the last element of any array?
//4 How do you access the first element of any array?
		
//5 Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
	
//String[] names = new String[6];
//		
//		names[0] = "Sam";
//		names[1] = "Tommy";
//		names[2] = "Tim";
//		names[3] = "Sally";
//		names[4] = "Buck";
//		names[5] = "Bob";
//		
//		int count0 = 0;
//		int count1 = 0;
//		int count2 = 0;
//		int count3 = 0;
//		int count4 = 0;
//		int count5 = 0;
//		
//		for (int i = 0; i < names[0].length(); i++) {
//			if (names[0].charAt(i) != ' ')
//				count0++;
//		}
//		for (int i = 0; i < names[1].length(); i++) {
//			if (names[1].charAt(i) != ' ')
//				count1++;
//		}for (int i = 0; i < names[2].length(); i++) {
//			if (names[2].charAt(i) != ' ')
//				count2++;
//		}for (int i = 0; i < names[3].length(); i++) {
//			if (names[3].charAt(i) != ' ')
//				count3++;
//		}for (int i = 0; i < names[4].length(); i++) {
//			if (names[4].charAt(i) != ' ')
//				count4++;
//		}for (int i = 0; i < names[5].length(); i++) {
//			if (names[5].charAt(i) != ' ')
//				count5++;
//		}
//int[] nameLengths = new int[6];
//		
//		nameLengths[0] = count0;
//		nameLengths[1] = count1;
//		nameLengths[2] = count2;
//		nameLengths[3] = count3;
//		nameLengths[4] = count4;
//		nameLengths[5] = count5;

//6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	
//		int sumOfNameLengths = 0;
//		for (int i = 0; i < nameLengths.length; i++)
//			sumOfNameLengths = sumOfNameLengths + nameLengths[i];
//		System.out.println(sumOfNameLengths);
		
//7	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
//		System.out.println(multiplyString("Bettlejuice", 3));	
		
//8 Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).		
//		String firstName = "Adam";
//		String lastName = "Maitland";
//		String fullName = createFullName(firstName, lastName);
//		
//		System.out.println(fullName);

//9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		
		
//		int[] values = new int[4];
//		
//		values[0] = 25;
//		values[1] = 20;
//		values[2] = 15;
//		values[3] = 50;
//		
//		int sumOfValues = 0;
//		for (int i = 0; i < values.length; i++)
//			sumOfValues = sumOfValues + values[i];
//		
//		System.out.println(isValid(sumOfValues));
		
		
//10 Write a method that takes an array of double and returns the average of all the elements in the array.

//		double[] spls = new double[6];
//		spls[0] = 105.4;
//		spls[1] = 106.3;
//		spls[2] = 98.6;
//		spls[3] = 102.5;
//		spls[4] = 88.2;
//		spls[5] = 115;
//		
//		System.out.println(meanSpls(spls));
		
//11 Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.		
		
//		double[] rms1 = new double[3];
//		
//		rms1[0] = 500;
//		rms1[1] = 490;
//		rms1[2] = 506;
//		
//		
//		double sumOfRms1 = 0;
//		for (int i = 0; i < rms1.length; i++)
//			sumOfRms1 = sumOfRms1 + rms1[i];
//			double average1 = sumOfRms1 / rms1.length;
//		
//		double[] rms2 = new double[3];
//		
//		rms2[0] = 488;
//		rms2[1] = 490;
//		rms2[2] = 499;
//		
//		
//		double sumOfRms2 = 0;
//		for (int i = 0; i < rms2.length; i++)
//			sumOfRms2 = sumOfRms2 + rms2[i];
//			double average2 = sumOfRms2 / rms2.length;
//		
//		System.out.println(isValid(sumOfRms1, sumOfRms2));
		
//12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.		

//		boolean isHotOutside = true;
//		double moneyInPocket = 12;
//		
//		if (willBuyDrink(isHotOutside, moneyInPocket)) {
//		    System.out.println("I'm getting a drink!");
//		}
		
//13 Create a method of your own that solves a problem. In comments, write what the method does and why you created it.		
		//I have used to a method to calculate a record calories intake : total allotment and return the answer of whether it is ok to consume more... input could also still change the total allotment thus keeping it dynamic. 
		
//		double intakeDaily = 2000;
//		
//		double[] intake = new double[3];
//		intake[0] = 600;
//		intake[1] = 700;
//		intake[2] = 800;
//		
//		double sum = sumIntake(intake);
//		
//		if (canEatMore(sumIntake(intake), intakeDaily)) {
//	    System.out.println("I can have a slice of pizza!");
//		} else {
//		System.out.println("I've already eaten too much, get on the bike instead.");	
//	}		
 		
	}
		
	//7 method
//	public static String multiplyString(String str, int num) {
//		String result = "";
//		for (int i = 0; i < num; i++) {
//			result += str;
//		}
//		return result;
//	}
	
	//8 method
//	public static String createFullName(String x, String y) {
//			String fullName = x + " " + y;
//			return fullName;	
//		
//	}	

	//9 method
//	public static boolean isValid(int sumOfValues) {
//		if (sumOfValues > 100) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	//10 method
//	public static double meanSpls(double[] numbers) {
//		double sum = 0;
//		for (double number : numbers) {
//			sum += number;
//		}
//		return sum / numbers.length;
//	}
	
	//11 Method	
//	public static boolean isValid(double sumOfRms1, double sumOfRms2) {
//	if (sumOfRms1 > sumOfRms2) {
//		return true;
//	} else {
//		return false;
//	}
//}	
	//12 Method
//	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//	if (isHotOutside && moneyInPocket > 10.50) {
//		return true;
//	} else {
//		return false;
//	}
//}
	
	//13 Method
//	public static int sumIntake(double[] numbers) {
//		int sum = 0;
//		for (double number : numbers) {
//			sum += number;
//		}
//		return sum;
//	}
//
//	public static boolean canEatMore(double sumIntake, double intakeDaily) {
//	if (sumIntake < intakeDaily) {
//		return true;
//	} else {
//		return false;
//	}
//}	
	
}	
	
	
	
	
