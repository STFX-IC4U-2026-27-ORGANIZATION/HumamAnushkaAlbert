package assignments;
import assignments.Footwear;
public class LinearUnsortedAlbert {

	//DESCRIPTION - Returns index of Footwear object that corresponds to the brand; if not found, return -1
	//PARAMETERS - Footwear[] a, String brand, int index 
	 //RETURN - int
	public static int searchBrand (Footwear[] a, String brand, int index) {
		
		//error case
		if (index > a.length-1)
			return -1;
		
		if (a[index].getBrand().equalsIgnoreCase(brand))
			return index;
		
		
		return searchBrand(a, brand, index +1);
	}

	//DESCRIPTION - Returns index of Footwear object that corresponds to the type of shoe; if not found, return -1
	//PARAMETERS - Footwear[] a, String typeOfShoe, int index 
	 //RETURN - int
	public static int searchTypeOfShoe(Footwear[] a, String typeOfShoe, int index) {
		
		//error  case
		if (index > a.length-1)
			return -1;
		
		if (a[index].getTypeOfFootwear().equalsIgnoreCase(typeOfShoe))
			return index;
		
		
		return searchBrand(a, typeOfShoe, index +1);
	}

}
