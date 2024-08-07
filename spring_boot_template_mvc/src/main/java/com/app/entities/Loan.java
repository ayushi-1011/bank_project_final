package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loan {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long loan_no;
@Column(nullable=false)
private String loanType;
@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name="acc_no")
private Account acc;

}
