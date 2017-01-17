
public class Product {
	private int idProduct;
	private String productName, description;
	private double price;
	
	public Product(int idProduct, String productName, double price, String description){
		this.idProduct = idProduct;
		this.productName = productName;
		this.price = price;
		this.description = description;
	}
	
	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString(){
		return getIdProduct() + "\t" + getProductName() + "\t" + getPrice() + "\t" + getDescription();
	}
}
