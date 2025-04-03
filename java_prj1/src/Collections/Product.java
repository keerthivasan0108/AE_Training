package Collections;

public class Product {
	int Product_ID;
	String Product_Name;
	int Price;
	String Brand;
	int Quantity;
	int total;
	int purchased_qty;
	
	
	public Product(int Product_ID,String Product_Name,int Price,String Brand,int Quantity ) {
		this.Product_ID = Product_ID;
		this.Product_Name = Product_Name;
		this.Price = Price;
		this.Brand = Brand;
		this.Quantity = Quantity;
		
	}
	
	public void show_details() {
		System.out.println("| "+this.Product_ID+"  |  "+this.Product_Name+"-"+this.Brand+"\t|  "+this.Quantity+"\t|\t"+this.Price+"\t|\t"+this.Brand+"\t  |");
	}
	
	public void purchased() {
		System.out.println("| "+this.Product_ID+"  |  "+this.Product_Name+"-"+this.Brand+"\t|  "+this.Price+"\t|\t"+this.purchased_qty+"\t  |\t"+this.total+"\t  |");
	}
	
}
