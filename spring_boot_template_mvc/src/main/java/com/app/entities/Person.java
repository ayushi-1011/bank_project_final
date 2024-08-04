package com.app.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private long adharNo;
    @Column(nullable = false)
    private long panNo;
@Lob
private byte[] profilePhoto;
    @Override
public String toString() {
	return "Person [personId=" + personId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
			+ lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dateOfBirth=" + dateOfBirth
			+ ", gender=" + gender + ", address=" + address + ", adharNo=" + adharNo + ", panNo=" + panNo
			+ ", profilePhoto=" + Arrays.toString(profilePhoto) + "]";
}

	public Person(Long personId, String firstName, String middleName, String lastName, String email, String phoneNumber,
		LocalDate dateOfBirth, String gender, String address, long adharNo, long panNo, byte[] profilePhoto) {
	super();
	this.personId = personId;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.address = address;
	this.adharNo = adharNo;
	this.panNo = panNo;
	this.profilePhoto = profilePhoto;
}

	// Constructors, Getters, Setters, etc.

    public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

public long getAdharNo() {
	return adharNo;
}

public void setAdharNo(long adharNo) {
	this.adharNo = adharNo;
}

public long getPanNo() {
	return panNo;
}

public void setPanNo(long panNo) {
	this.panNo = panNo;
}

public byte[] getProfilePhoto() {
	return profilePhoto;
}

public void setProfilePhoto(byte[] profilePhoto) {
	this.profilePhoto = profilePhoto;
}

	public Person() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
