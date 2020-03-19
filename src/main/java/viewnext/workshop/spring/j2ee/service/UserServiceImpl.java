package viewnext.workshop.spring.j2ee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import viewnext.workshop.spring.j2ee.dao.UserDao;
import viewnext.workshop.spring.j2ee.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	 
	@Transactional
	public void save(User user) {
		userDao.create(user);
	}
	
	@Transactional(readOnly = true)
	public List<User> list() {
		return userDao.getAll();
	}
	
}
