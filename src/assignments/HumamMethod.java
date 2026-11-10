package assignments;

public class HumamMethod {

	public static Footwear searchAll(Footwear[] a, String searchWord) {
	    
	    // checks brand
	    int index = LinearUnsortedAlbert.searchBrand(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // checks Type of Shoe
	    index = LinearUnsortedAlbert.searchTypeOfShoe(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // checks price
	    index = LinearUnsortedAnushka.searchPrice(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // checks size
	    index = LinearUnsortedAnushka.searchSize(a, searchWord, 0);
	    if (index != -1) {
	        return a[index];
	    }

	    // returns null if no match is found
	    return null;
	}

}
