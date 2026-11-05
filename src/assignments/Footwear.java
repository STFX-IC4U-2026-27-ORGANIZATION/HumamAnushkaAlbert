package assignments;

public class Footwear {

	protected String brand;
	protected String typeOfFootwear;
	protected String price;
	protected String size;
	
	
	public Footwear() {
		this.brand = "";
		this.typeOfFootwear ="";
		this.price ="";
		this.size = "";
	}
	
	public Footwear(String b, String tOF, String p, String s) {
		
		this.brand = b;
		this.typeOfFootwear = tOF;
		this.price = p;
		this.size = s;
	}
	
	// get  methods
	public String getBrand() {
		
		return brand;
	}
	public String getTypeOfFootwear() {
		
		return typeOfFootwear;
	}
	public String getPrice() {
		
		return price;
	}
	public String getSize() {
		
		return size;
	}
	
	
	
	// set methods
	public void setBrand(String b) {
		
		this.brand = b;
	}
	public void setTypeOfFootwear(String tOF) {
		
		this.brand = tOF;
	}
	public void setPrice(String p) {
		
		this.brand = p;
	}
	public void setSize(String s) {
		
		this.brand = s;
	}
	
	@Override
	public String toString() {
		
		return this.brand + "."+ this.typeOfFootwear + "."+ this.price + "."+ this.size;
	}
	
	
}
