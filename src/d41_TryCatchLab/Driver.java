package d41_TryCatchLab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		yaz();
		
	}
	
	public static void yaz() {
		File file = new File("read.me");
		FileWriter fileWriter = null;
		Scanner scanner = new Scanner(System.in);
		try {
			fileWriter = new FileWriter(file);
			System.out.print("Bir yazi giriniz: ");
			fileWriter.write(scanner.nextLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			scanner.close();
		}
		
	}

}
