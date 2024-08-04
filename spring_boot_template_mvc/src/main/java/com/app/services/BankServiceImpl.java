package com.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BankDao;
import com.app.entities.Bank;

import java.util.List;
import java.util.Optional;



@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankDao bankDao;

    @Override
    public Bank addBank(Bank bank) {
        return bankDao.save(bank);
    }

    @Override
    public Optional<Bank> getBankById(Long bankId) {
        return bankDao.findById(bankId);
    }

//    @Override
//    public List<Bank> getAllBanks() {
//        return bankRepository.findAll();
//    }

    @Override
    public Bank updateBank(Long bankId, Bank bankDetails) {
        Bank bank = bankDao.findById(bankId)
                .orElseThrow();
        bank.setBankName(bankDetails.getBankName());
       
        bank.setAddress(bankDetails.getAddress());
        bank.setPhoneNumber(bankDetails.getPhoneNumber());
        bank.setEmail(bankDetails.getEmail());
        bank.setEstablishedDate(bankDetails.getEstablishedDate());
        

        return bankDao.save(bank);
    }

    @Override
    public void deleteBank(Long bankId) {
        Bank bank = bankDao.findById(bankId)
                .orElseThrow();
        bankDao.delete(bank);
    }
}
