package assignments;

public class LinearUnsortedAnushka {

	//DESCRIPTION - Returns index of Footwear object that corresponds to the price, if not found return -1
	//PARAMETERS - Footwear[] a, String price, int index 
 	//RETURN - int  
	
	public static int searchPrice (Footwear[] a, String price, int index) {
		
		//Error Case
		if (a[index] == null || index < 0 || index > a.length)
			return -1;
		
		//Base Case 
		if (a[index].getPrice().equals(price))
			return index; 
		
		//Recursive Call
		return searchPrice(a, price, index + 1); 
		
	}
	
	
	
	//DESCRIPTION - Returns index of Footwear object that corresponds to the size, if not found return -1
	//PARAMETERS - Footwear[] a, String size, int index 
	//RETURN - int
	
	public static int searchSize (Footwear[] a, String size, int index) {
	
		//Error Case
		if (a[index] == null || index < 0 || index > a.length)
			
			return -1; 
		
		//Base Case 
		if (a[index].getSize().equals(size))
			return index; 
		
		//Recursive Call 
		return searchSize(a, size, index + 1) ; 
	}
	
}
