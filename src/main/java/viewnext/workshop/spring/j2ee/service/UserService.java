package viewnext.workshop.spring.j2ee.service;

import java.util.List;

import viewnext.workshop.spring.j2ee.model.User;

public interface UserService {

	void save(User user);
	List<User> list();
	
}
