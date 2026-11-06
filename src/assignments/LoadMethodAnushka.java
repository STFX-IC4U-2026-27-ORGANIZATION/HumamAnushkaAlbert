package assignments;
import java.io.*;
import java.util.ArrayList;

public class LoadMethodAnushka {
	
	
	//DESCRIPTION - Returns  a Footwear[] populated with Footwear objects from file. 
	//PARAMETERS - String filename
	//RETURN - Footwear[] 
	
	public static Footwear[] loadItems (String filename) {
		
		//variables 
		String word; 
		ArrayList <Footwear> tempArray = new ArrayList(); 
		BufferedReader br = null; 
		
		try {
			
			br = new BufferedReader (new FileReader (filename));
			
			while ( (word = br.readLine()) != null) {
				
				String [] tempSplit = word.split(" "); 
				
				tempArray.add(new Footwear (tempSplit[0], tempSplit[1], tempSplit[2], tempSplit[3]));
				
			}
			
			br.close(); 
		}
		
		catch(Exception e) {
			
			System.out.println("Failed to read file"); 
			
		}
		
		Footwear[] footwearData = new Footwear[tempArray.size()]; 
		
		tempArray.toArray(footwearData); 
		
		return footwearData; 
	}
	
}
