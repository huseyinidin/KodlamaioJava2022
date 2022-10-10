package oopWithNLayeredApp.src.oopWithNLayeredApp;

import oopWithNLayeredApp.src.oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.src.oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.src.oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.src.oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.src.oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.src.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.src.oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1, "Xaomi", 5000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};
		
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
	}

}
