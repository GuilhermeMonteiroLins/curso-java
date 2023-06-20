package entities;

public class Product {
	
	/**
	 * Se não houver modificador de acesso apenas as classes que estão no mesmo pacote poderão acessa-la
	 * 
	 * Se o modificado de acesso for private qualquer tipo de classe que for acessar o parametro devera utilizar getter e setter
	 * 
	 */
	String name;
	private double price;
	private int quantity;

	
	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValuInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValuInStock());
	}
}
