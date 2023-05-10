package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.Login;



public interface ILogin extends JpaRepository<Login, Long>{
	
	String findByUsernameAndPassword(String username, String password);

	

}
