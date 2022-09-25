package w3Assignments;

public class w3Assign {

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
		
		int ff = 1;
		
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
		
		
	}
	//Problem 7
	
		public static String xString(String word, int n) {
			String result = " ";
		for( int i = 0; i < n; i++) {
			result += word;
		}
		return result;
		}

		
		
		
		
		
		
		
	}


