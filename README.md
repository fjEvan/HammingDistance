# Hamming Distance of 2 DNA strings of the same length

A DNA string is a string consisting of the alphabet A, C, G, and T (adenine, cytosine, guanine, and thymine). This program  will take two strings of DNA as input and collect and print some basic statistics for both strings. The statistics include:

The length of both DNA strings
The number of occurrences of 'A', 'C', 'G', and 'T' in each string
The Hamming distance between the two strings
The Hamming distance between two strings of equal length is one of the simplest metrics in information theory. The Hamming distance between two strings is the total number of places where the strings differ. In terms of DNA, it can be used to calculate the total number of errors (mutations) that were introduced by copying a DNA string. For instance, te strings:

"GCCATCCATCAC"
"GTCAGCCAACAC"
differ in 3 places (hilighted in red), making the Hamming distance of the above 3.

The output would be:  

Please enter the first DNA sequence: GCCATCCATCACCTACA
Please enter the second DNA sequence: GTCAGCCAACACGACTA
Generating DNA report.
DNA string 1: GCCATCCATCACCTACA
String length: 17
Nucleotides:
5 occurrences of adenine (A)
8 occurrences of cytosine (C)
1 occurrences of guanine (G)
3 occurrences of thymine (T)
DNA string 2: GTCAGCCAACACGACTA
String length: 17
Nucleotides:
6 occurrences of adenine (A)
6 occurrences of cytosine (C)
3 occurrences of guanine (G)
2 occurrences of thymine (T)
The Hamming distance between DNA strings 1 and 2 is: 7

This program finds the Hamming Distance between two strings of the same length. Exceptions will be raised if the strings are of different lengths.  
