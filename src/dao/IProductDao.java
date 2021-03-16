package dao;

import java.util.List;

import beans.Product;

public interface IProductDao {
	List<Product> listeDeproduits();
	List<Product> listeDeProduitsParCategory(String category);
	Product getProductByID(int id);
	
}
