package sandbox;
import assignments.Footwear;
import assignments.LinearUnsortedAlbert;
import assignments.LinearUnsortedAnushka;
import assignments.LoadMethodAnushka;

public class TestAnushkaMethods {
	public static void main(String[] args) {
		
        Footwear[] newArray = new Footwear[2];
        Footwear object= new Footwear("Puma", "Shoes", "$90", "9");
        Footwear object1 = new Footwear("Crocs", "Slippers", "$189", "7");
       
        newArray[0]= object;
        newArray[1]= object1;
    
        System.out.println(LinearUnsortedAnushka.searchPrice(newArray, "0", 0));

		
	}
}
