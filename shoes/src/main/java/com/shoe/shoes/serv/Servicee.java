package com.shoe.shoes.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shoe.shoes.entity.Users;
import com.shoe.shoes.repository.UserRepository;

public class Servicee {
@Autowired

private UserRepository repo;
public List< Users> listAll(){
	return repo.findAll();
	
	
}

public Users get(long id) {
	return repo.findById(id).get();
	
	
}
}
