package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	// Dependency injection
	private ProductDao productDao;
	// ****** Polymorphism ******
	private Logger[] loggers;

	// Loosely coupled

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		// Manager = Business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price can't be less than 10");
		}

		// Rule: A layer should only communicate with the interface when using the class
		// of another layer.
		// Bad code
		// ProductDao productDao = new JdbcProductDao();
		productDao.add(product);

		for (Logger logger : loggers) { // [db, file, mail]
			logger.log(product.getName());
		}

	}

}
