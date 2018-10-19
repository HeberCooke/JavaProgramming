

//Heber Cooke 		10/19/2018
//Exercise 12-15

import java.util.*;
import java.io.*;

class Exercise12_15{
	
	public static void main(String[] args)throws Exception{	
		
		java.io.File file = new java.io.File("Exercise12_15.txt");
		int []num =new int [100]; 
		// array with random numbers
		for (int i = 0; i <100; i ++){
			num[i] = (int)(Math.random()*100);
		}
		
		// making a file to put 100 numbers in
		if(!file.exists()){
			try(PrintWriter p = new PrintWriter(file);) 
			{	
				for (int i = 0; i < 100; i++){
					p.print( num[i]+ " ");
				}
			}	

		}
		// scanner read object to read the file 
		// an array to hold the data and sort it
		Scanner input = new Scanner(file);
		int [] list = new int[100];
		for (int i = 0;i< 100; i++){
			list[i] = input.nextInt();
		}
		Arrays.sort(list);
		// print the sorted array 
		for (int i = 0; i < 100; i++){
			System.out.print(list[i]+" ");
		}		
	}
}