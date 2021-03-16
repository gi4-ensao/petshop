package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Product;

public class IProductDaoImpl implements IProductDao{

	public List<Product> listeDeproduits() {
		// TODO Auto-generated method stub
		Connection connexion = SingletonDeConnexion.getConnection();
		List<Product> produits = new ArrayList<Product>();
		
		try{
			PreparedStatement ps = connexion.prepareStatement("select * from product");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){ 
				Product p = new Product();
				
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setImage(rs.getString("image"));;
				p.setPrice(rs.getDouble("price"));
				p.setQuantite(rs.getInt("quantity"));
				p.setCategory(rs.getString("category"));
				
				produits.add(p);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return produits;
	}

	public List<Product> listeDeProduitsParCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByID(int id) {
		Connection connexion = SingletonDeConnexion.getConnection();
		Product p = new Product();

		try{
			PreparedStatement ps = connexion.prepareStatement("select * from product where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){ 
				
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setImage(rs.getString("image"));;
				p.setPrice(rs.getDouble("price"));
				p.setQuantite(rs.getInt("quantity"));
				p.setCategory(rs.getString("category"));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return p;
	}

}
