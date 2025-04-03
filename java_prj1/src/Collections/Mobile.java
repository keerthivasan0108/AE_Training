package Collections;

public class Mobile {
	String Brand;
	String Model;
	int Price;
	int Ram;
	
	public Mobile(String Brand,String Model,int Price,int Ram) {
		this.Brand = Brand;
		this.Model = Model;
		this.Price = Price;
		this.Ram = Ram;
	}
	
	public void show_details() {
		System.out.println("***********************");
		System.out.println("Brand : "+this.Brand);
		System.out.println("Model : "+this.Model);
		System.out.println("Price : "+this.Price);
		System.out.println("Ram : "+this.Ram + " GB");
		System.out.println("***********************");
	}
}
