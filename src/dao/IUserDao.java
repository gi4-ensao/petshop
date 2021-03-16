package dao;

import beans.User;

public interface IUserDao {
	public boolean check(User user);
	public User save(User user);
	public boolean login(User user);
	public User getUserWithUserName(String userName);
	
}
