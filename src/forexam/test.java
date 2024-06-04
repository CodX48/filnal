package forexam;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import animal.*;
public class test {
	
	public static void main(String[] args) {
		
		ArrayList<animalactions> animals_action = new ArrayList<>();
		
		try {
			FileOutputStream file = new FileOutputStream("dataBase.bin");
			animals_action.add(new cat("nisa",5));
			animals_action.add(new dog("popstar",10));
			
			for(animalactions A : animals_action) {
				file.write(A.toString().length() >> 8);
				file.write(A.toString().length());
				file.write(A.toString().getBytes());
			}
			System.out.println("done!!");
			System.out.println("________________________________");
			file.close();
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		try {
			ArrayList<String> list = new ArrayList<>();
			FileInputStream file = new FileInputStream("dataBase.bin");
			while(file.available() > 0) {
				int sizeofstring = file.read() << 8 | file.read();
				byte[] linebyte = new byte[sizeofstring];
				file.read(linebyte);
				list.add(new String(linebyte));
			}
			file.close();
			File Tfile = new File("datafile.txt");
		    PrintWriter textfile = new PrintWriter(Tfile);
				textfile.println(list.get(0));
				textfile.println(list.get(1));
			textfile.close();
			
			Scanner scan = new Scanner(Tfile);
			
			while(scan.hasNextLine()) {
				
				String[] Animal = scan.nextLine().split("_");
				System.out.println("name: " + Animal[0] + "\nAge: " + Animal[1] + "\nGender: " + Animal[2]);
				System.out.println("________________________________");
			}
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
		
		
	}
	
	public static void run(animal a) {
		System.out.println("the " + a.GetGender() + " is running");
	}
}
