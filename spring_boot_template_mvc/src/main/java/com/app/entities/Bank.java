package com.app.entities;

import javax.persistence.Entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "banks")
public class Bank {

    @Id
    private Long bankId;

    @Column(nullable = false, unique = true)
    private String bankName;

    private String address;

    private String phoneNumber;

    private String email;

    private LocalDate establishedDate;

//  @Column(nullable = false, unique = true)
//  private String bankCode;
//
//    @Column(unique = true)
//    private String ifscCode;

    

    public Bank() {}
@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", establishedDate=" + establishedDate + "]";
	}
public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(LocalDate establishedDate) {
		this.establishedDate = establishedDate;
	}
public Bank(Long bankId, String bankName, String address, String phoneNumber, String email, LocalDate establishedDate) {
	super();
	this.bankId = bankId;
	this.bankName = bankName;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.establishedDate = establishedDate;
}
}

    

