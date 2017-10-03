// 20171002  Jiao Feng (Evan)
/* find the Hamming Distance between two strings of the same length
   and write the DNA report */

import java.util.Scanner;

public class HammingDistance
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String dna1;
		String dna2;
		System.out.print("Please enter the first DNA sequence: ");
		dna1 = input.next();

		System.out.print("Please enter the second DNA sequence: ");
		dna2 = input.next();

		System.out.println("Generating DNA report.");

		report(dna1, dna2);  // write the report about the 2 DNA strings
	}

	private static void report(String a, String b)
	{
		int length1 = a.length();	// length of the 2 DNA strings
		int length2 = b.length();	

		if(length1 != length2)  // report error if the 2 strings have different lengths
		{
			System.out.println("ERROR! The strings are of different lengths.");
			return;
		}

		char[] c1 = a.toCharArray();  // turn the 2 strings to char arrays
		char[] c2 = b.toCharArray();

		int hammingDistance = 0;
		int count1[] = new int[4];  // 4 counts for DNA string 1 and 2, respectively
		int count2[] = new int[4];  // automatically initialize the 4 counts to 0

		for(int i = 0; i < length1; i++)  // c1,c2 have the same length
		{                                 // loop and test each char 
			if(c1[i] == c2[i])
			{                 // when having the same char, call the function just once
				int index = nucleotideIndex(c1[i]);
				count1[index]++;          // count increments 
				count2[index]++;
			}
			else  // if different pair occurs, increment hamming distance
			{       
				hammingDistance++;
							       // call the function twice to get different indexes
				int index1 = nucleotideIndex(c1[i]); 
				int index2 = nucleotideIndex(c2[i]);
				count1[index1]++;        // count increments
				count2[index2]++;
			}
		}                       // start printing the statistics
		System.out.println("DNA string 1: " + a); 
		System.out.println("String length: " + length1);
		System.out.println("Nucleotides:\n" 
						  + count1[0] + " occurrences of adenine  (A)\n"
						  + count1[1] + " occurrences of cytosine (C)\n"
						  + count1[2] + " occurrences of guanine  (G)\n"
						  + count1[3] + " occurrences of thymine  (T)");

		System.out.println("DNA string 2: " + b); 
		System.out.println("String length: " + length2);
		System.out.println("Nucleotides:\n" 
						  + count2[0] + " occurrences of adenine  (A)\n"
						  + count2[1] + " occurrences of cytosine (C)\n"
						  + count2[2] + " occurrences of guanine  (G)\n"
						  + count2[3] + " occurrences of thymine  (T)");

		System.out.println("The Hamming Distance between DNA strings 1 and 2 is: " 
			               + hammingDistance);
	}

// map the corresponding nucleotide indexes with array indexes used in count[]
	private static int nucleotideIndex(char c)  
	{                         
		int index = 0;
		switch(c)
		{
			case 'A': index = 0;
					  break;
			case 'C': index = 1;
					  break;
			case 'G': index = 2;
					  break;
			case 'T': index = 3;
					  break;
		}

		return index;
	}
}















