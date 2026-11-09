package assignments;

public class HumamMethod {

	public static Footwear searchAll(Footwear[] a, String searchWord) {
	    
	    // Checks Brand
	    int index = LinearUnsortedAlbert.searchBrand(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // Checks Type of Shoe
	    index = LinearUnsortedAlbert.searchTypeOfShoe(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // Checks Price
	    index = LinearUnsortedAnushka.searchPrice(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // Checks Size
	    index = LinearUnsortedAnushka.searchSize(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // Returns null if no match is found
	    return null;
	}

}
