package oopWithNLayeredApp.src.oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.src.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	
	//JDBC = Method of accessing the database
	public void add(Product product) {
		
		//Only access codes to the database are written here.

		System.out.println("Added to database with JDBC");
	}
}
