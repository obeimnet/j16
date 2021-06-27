package j16.record;

public class Main {
	
  public static void main(String[] args) {
	Product product = new Product("abc", "j16 product");
	System.out.println(product.code());
	System.out.println(product.description());
  }
}
