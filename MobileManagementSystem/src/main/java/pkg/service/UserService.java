package pkg.service;

import java.util.List;

import pkg.dto.UserDto;
import pkg.entity.User;

public interface UserService {

	public List<User> getAll();
	
	   public User saveUser(UserDto userdto)throws Exception;
		
		public User update(User user);
		
		 public void deleteById(int id);
	
}