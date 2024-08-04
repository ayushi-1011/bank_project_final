package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entities.Bank;
import com.app.services.BankService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    @Autowired
    private BankService bankService;

    // Create a new Bank
    @PostMapping
    public ResponseEntity<Bank> createBank(@RequestBody Bank bank) {
        Bank createdBank = bankService.addBank(bank);
        return new ResponseEntity<>(createdBank, HttpStatus.CREATED);
    }

    // Get a Bank by ID
    @GetMapping("/{id}")
    public ResponseEntity<Bank> getBankById(@PathVariable(value = "id") Long bankId) {
        Optional<Bank> bank = bankService.getBankById(bankId);
        return bank.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

//    // Get all Banks
//    @GetMapping
//    public List<Bank> getAllBanks() {
//        return bankService.getAllBanks();
//    }

    // Update a Bank by ID
    @PutMapping("/{id}")
    public ResponseEntity<Bank> updateBank(@PathVariable(value = "id") Long bankId, @RequestBody Bank bankDetails) {
        Bank updatedBank = bankService.updateBank(bankId, bankDetails);
        return ResponseEntity.ok(updatedBank);
    }

    // Delete a Bank by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBank(@PathVariable(value = "id") Long bankId) {
        bankService.deleteBank(bankId);
        return ResponseEntity.noContent().build();
    }
}
