package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.UserDao;
import springmvc.model.User;
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public int createuser(User user) {
		return this.userDao.saveUser(user);
	}
}
