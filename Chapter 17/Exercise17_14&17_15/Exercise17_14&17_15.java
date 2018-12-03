// Heber Cooke
//Exercise 17_14 & 17_15



import java.io.*;
import java.util.Scanner;

public class Exercise17_14&17_15 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file to Encode(e.g. temp.txt)");
		String inFile = input.nextLine();
		System.out.println("Enter a new  file that saves the encoded version (e.g  somthing.txt) ");
		String outFile = input.nextLine();

		File iFile = new File(inFile);
		File oFile = new File(outFile);
		// starting .txt file
		try (FileInputStream in = new FileInputStream(iFile)) {

			byte[] temp = in.readAllBytes();
			// adding 5 to each byte in array
			for (int i = 0; i < temp.length; i++) {
				temp[i] += 5;
			}
			// making new File that is encoded
			try (FileOutputStream out = new FileOutputStream(oFile)) {
				out.write(temp);
			}

		}
		System.out.println("The File is enoded in " + oFile);
		// -----------------------------------------------------------------------------------------------------
		// Exercise 17_15 below

		System.out.println("Enter the encoded file name (e.g somthing.txt) ");
		String encrypdedFile = input.nextLine();
		System.out.println("Enter a new file name for the decoded version (e.g somthing .txt)");
		String decryptedFile = input.nextLine();
		input.close();
		File iFile2 = new File(encrypdedFile);
		File oFile2 = new File(decryptedFile);
  
		try (FileInputStream n2 = new FileInputStream(iFile2)) {

			byte[] temp2 = n2.readAllBytes();
			// Subtracting 5 to each byte in array
			for (int i = 0; i < temp2.length; i++) {
				temp2[i] -= 5;
			}
			// new file that has been
			try (FileOutputStream out2 = new FileOutputStream(oFile2)) {
				out2.write(temp2);
			}
		}
		System.out.println("The file is decoded in " + oFile2);
	}// end main----------------------------

}// end class-----------------------------------
