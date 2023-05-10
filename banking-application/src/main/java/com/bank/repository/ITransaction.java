package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.Transaction;

public interface ITransaction extends JpaRepository<Transaction, Long>{

}
