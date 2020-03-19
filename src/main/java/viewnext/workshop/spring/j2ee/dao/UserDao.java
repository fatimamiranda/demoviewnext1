package viewnext.workshop.spring.j2ee.dao;

import java.util.List;

import viewnext.workshop.spring.j2ee.model.User;

public interface UserDao {

	public void create(User user);
	public List<User> getAll();
	
}
