package com.app.services;


	import java.util.List;
	import java.util.Optional;

import com.app.entities.Bank;

	public interface BankService {
	    Bank addBank(Bank bank);
	    Optional<Bank> getBankById(Long bankId);
//	    List<Bank> getAllBanks();
	    Bank updateBank(Long bankId, Bank bankDetails);
	    void deleteBank(Long bankId);
	}
