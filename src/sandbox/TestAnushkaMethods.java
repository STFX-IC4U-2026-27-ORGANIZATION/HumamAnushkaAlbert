package sandbox;
import assignments.Footwear;
import assignments.LinearUnsortedAnushka;
import assignments.LoadMethodAnushka;

public class TestAnushkaMethods {

	public static void main(String[] args) {
		
		String file = "src//Footwear.txt";
		Footwear[] loadedFiles = LoadMethodAnushka.loadItems(file); 
		
		
		for(int i = 0; i< loadedFiles.length; i++ ) {
			System.out.println(loadedFiles[i].getBrand());
			System.out.println(loadedFiles[i].getTypeOfFootwear());
			System.out.println(loadedFiles[i].getPrice());
			System.out.println(loadedFiles[i].getSize());
		}
		
		
	}

}
