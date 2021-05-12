package odev2ders;

public class Main {
	public static void main(String[] args) {
		
		Product product1 = new Product(1, "C# + Angular" , "Engin Demirog");
		Product product2 = new Product(2, "Java + REACT" , "Engin Demirog");
		
		Product[] products = {product1,product2};
		
		for (Product product : products) {
			
			System.out.println(product.name + product.teacher);
		
		
		}
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
		
		
		
	}

}
