package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private long acc_no;
@OneToMany(mappedBy="acc" ,cascade = CascadeType.ALL ,orphanRemoval=true)
private List<Loan>loans;
}
