package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Bank;

public interface BankDao extends JpaRepository<Bank, Long> {

}
