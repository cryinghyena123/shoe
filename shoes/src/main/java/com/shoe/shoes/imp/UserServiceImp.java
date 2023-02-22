package com.shoe.shoes.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoe.shoes.entity.Users;
import com.shoe.shoes.repository.UserRepository;
import com.shoe.shoes.service.UserService;
@Service
public class UserServiceImp implements UserService {

	
private UserRepository userrepository;


	public UserServiceImp(UserRepository userrepository) {
	super();
	this.userrepository = userrepository;
}


	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}


	@Override
	public Users saveStudent(Users user) {
	
		return userrepository.save(user);
	}
	
	
}
