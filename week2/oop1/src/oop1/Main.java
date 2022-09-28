package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Coffee Machine");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("Coffee1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Coffee Machine");
		product2.setUnitPrice(8500);
		product2.setDiscount(8);
		product2.setUnitInStock(4);
		product2.setImageUrl("Coffee2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Coffee Machine");
		product3.setUnitPrice(9500);
		product3.setDiscount(9);
		product3.setUnitInStock(5);
		product3.setImageUrl("Coffee3.jpg");

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05111111111");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Hakan");
		individualCustomer.setLastName("Demir");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05222222222");
		corporateCustomer.setCustomerNumber("123456");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("11111111111");

		Customer[] customers = { individualCustomer, corporateCustomer };

	}

}
