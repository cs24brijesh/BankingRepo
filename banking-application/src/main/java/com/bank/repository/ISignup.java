package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Signup;


public interface ISignup extends JpaRepository<Signup, Long>{

}
