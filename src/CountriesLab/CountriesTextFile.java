package CountriesLab;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;





public class CountriesTextFile {

	static  String  fileName= "countries.txt";
	
	public static void main(String[] args) {
     String  fileName= "countries.txt";
     
    //  createFile(fileName);
    //  readFromFile(fileName);
   //   writeToFile(fileName);
	}
	
	
	public static void writeToFile (String fileName) {
		Path filePath = Paths.get( fileName);
		File file = filePath.toFile();
		String userCountry;
	//	Scanner scan = new Scanner(System.in);
	//	System.out.println("Please enter a country");
		Scanner in = new Scanner(System.in);
	 userCountry = SampleValidator.getString(in, "Please enter a country");
	   System.out.println("This country has been saved!");
	   
		
		try {//the true parameter for the FileOutputTream () constructor
			//appends data to the end of the file
			
			PrintWriter printToFile= new PrintWriter(new FileOutputStream( file, true));
			printToFile.println(userCountry);
			printToFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
		}
	}
      
      public static void readFromFile( String fileName) {
		
		Path filePath = Paths.get( fileName);
		File file = filePath.toFile();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line =reader.readLine();
			
			while (line !=null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("contact customer service");
		} 
		}

	
	
	public static void createFile( String fileName) {
		
		
		Path filePath =Paths.get( fileName);
		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("File was created successfully");
			}catch (IOException e) {
				System.out.println("something went wrong with the file creation");
			}
			}else {
				System.out.println("File already exists");
}
	}
}
		
		
		

		
	

