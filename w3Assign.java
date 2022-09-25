package w3Assignments;

import java.util.Scanner;

public class w3Assign {
	

//problem 13
public static void finished() {
	System.out.println("I finally finished the assignment!");
}
	public w3Assign() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Problem 1
		
	int[] ages = {3,9,23,64,2,8,28,93,22};
	//New age added was 22.
	System.out.println("Last Element - First Element = " + (ages[ages.length - 1] - ages[0]));
	
	int sum = 0;
	
	for (int i = 0; i < ages.length; i++) {
		sum += ages[i];
		
	}
		System.out.println("Average Age: " + sum / ages.length);
		
		
		
		
		
		
		
		
		
		
		
		//Problem 2
		
	    String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	    
	    int letters = 0;
		
		for (int n = 0; n < names.length; n++) {
			
			letters += names[n].length();
		}
			System.out.println("Average length of names: " + (letters / names.length));
			
			String namesTogether = "";
			System.out.print("Concatenate the names: ");
		for (int m = 0; m < names.length; m++) {
			namesTogether += names[m] + " ";
			
		}
		System.out.println(namesTogether);
		
		
		
		System.out.println("");
		
		
		
		
		
		
		
		//Problem 3
		System.out.println("How do you access the last element of any array?");
		System.out.println("Answer: arrayName[arrayName.length - 1] <---This line of code is looking inside your array at the last entry" );
		
		//Problem 4
		System.out.println("How do you access the first element of any array?");
		System.out.println("Answer: array[0] is looking inside the array at the first entry on 0.");
		System.out.println("");
		
		//Problem 5
		int[] nameLengths = new int[6];
		
		for (int o = 0; o < names.length; o++) {
			nameLengths[o] = names[o].length(); 
					System.out.println(names[o].length());
		}
		//Problem 6
			int sum2 = 0;
		for (int o = 0; o < nameLengths.length; o++) {
			sum2 += nameLengths[o];
		}
		System.out.println("");
		System.out.println("The sum of all elements in the nameLengths array = " + (sum2));
		System.out.println("");
		System.out.print("7.");
	//problem 7 code
		System.out.println(xString(" it goes on and", 3));
	//Problem 8 code
		System.out.println("");
		String firName = "Haven";
		String lName = "Summerfield";
		String fullName = createFullName(firName, lName);
		System.out.print("8. ");
		System.out.println(fullName);
	//problem 9 code
		int[] myArray = {7,10,8,90};
		sumArray(myArray);
		int sum3 =sumArray(myArray);
		System.out.println("");
		System.out.print("9. ");
		if (sum3 > 100) {
			System.out.println("True");
		}
	//problem 10 code
		double[] myArray2 = {5,4,5,6,8,3,9,6};
		calcAvg(myArray2);
		double avg = calcAvg(myArray2);
		System.out.println("");
		System.out.print("10. ");
		System.out.println(avg);
	//problem 11 code
		double[] x = {52,4,5,63,8,34,9,45};
		double[] y = {25,43,5,6,8,23,9,65};
		calcAvg2(x, y);
		boolean avg1 = calcAvg2(x, y);
		boolean avg2 = calcAvg2(x, y);
		System.out.println("");
		System.out.println("11. " + avg1);
		//Didn't quite get this one
	//problem 12 code	
		System.out.println("");
		System.out.println("Is it hot outside? Enter true or false");
        Scanner n = new Scanner(System.in);
        boolean isHotOutside = n.nextBoolean();
        System.out.println("How much money do you have?");
        double moneyInPocket = n.nextDouble();
		boolean result =willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("Did you buy a drink? " + result);
	//problem 13
		finished();
		
	}
	//Problem 7
	
		public static String xString(String word, int n) {
			String result = " ";
		for( int i = 0; i < n; i++) {
			result += word;
		}
		return result;
		}
	//Problem 8
		public static String createFullName(String x, String y) {
			String fullName = x + " " + y;
			return fullName;
		}
		
	//problem 9
		public static int sumArray(int[] numbers) {
			int sum3 = 0;
		for (int number : numbers) {
			sum3 += number;
		}
			return sum3;
		}
	//problem 10 
		public static double calcAvg(double[] numbers)	{
			double sum = 0;
		for (double number : numbers) {
				sum += number;
			}
			double avg = (sum / numbers.length);
			return avg;
		}	
	//problem 11
		public static boolean calcAvg2(double[] x, double[] y)	{
			double sum1 = 0;
		for (double number : x) {
				sum1 += number;
			}
			double avg1 = (sum1 / x.length);
			
			double sum2 = 0;
			for (double number : y) {
					sum2 += number;
			}
			double avg2 = (sum2 / y.length);
			
			if(avg1 > avg2) {
			
			return true;
		
			}
				return false;
		}
		//problem 12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			boolean result = isHotOutside;
			if (isHotOutside == true && moneyInPocket > 10.50) {
				 result = true;
			} else {
				 result = false;
			}
			return result;
	
		
		
		
		
			
			
		
		}
		
}


