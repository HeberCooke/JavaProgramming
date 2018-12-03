
// Heber Cooke 		11/30/2018

//Exercise 17_1

import java.io.*;

public class Exercise17_1 {

	public static void main(String[] args) throws IOException {

		File file = new File("Exercise17_1");
		try (
				FileWriter wr = new FileWriter(file, true);
				PrintWriter pw = new PrintWriter(wr);
				) {

			int num;
			for (int i = 0; i < 100; i++) {
				num = ((int) (Math.random() * 100) + 1);
				pw.print(num + " ");
			}
		}

	}
}
