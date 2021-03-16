package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;

public class IUserDaoImpl implements IUserDao{

	@Override
	public boolean check(User user) {
		boolean userNameExists = false;
		try{
		Connection connection = SingletonDeConnexion.getConnection();
		PreparedStatement ps = connection.prepareStatement("select * from user where userName = ?");
		ps.setString(1, user.getUserName());
		ResultSet r1= ps.executeQuery();
		if(r1.next()) {
		  userNameExists = true;
		}else{
			userNameExists = false;
		}}catch(SQLException e){
			e.printStackTrace();
		}
		return userNameExists;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		Connection connection = SingletonDeConnexion.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into user (userName,password,email,phone,company,adress ) values (?,MD5(?),?,?,?,?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getEmail());
			ps.setString(4,user.getPhone());
			ps.setString(5, user.getCompany());
			ps.setString(6, user.getAdress());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	public boolean login(User user){
		boolean userExists = false;
		try{
			Connection connection = SingletonDeConnexion.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from user where userName = ? and password = MD5(?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());

			ResultSet r1= ps.executeQuery();
			
			if(r1.next()){
				userExists = true;
			}else{
				userExists = false;

			}
			}catch(SQLException e){
				e.printStackTrace();
			}
		return userExists;
	}

	
	@Override
	public User getUserWithUserName(String userName) {
		User user = new User();
		Connection connection = SingletonDeConnexion.getConnection();
		PreparedStatement ps=null;
		try{
			ps = connection.prepareStatement("select * from user where userName = ?");
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setCompany(rs.getString("company"));
				user.setAdress(rs.getString("adress"));
				user.setPhone(rs.getString("phone"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return user;
	}

	
}
