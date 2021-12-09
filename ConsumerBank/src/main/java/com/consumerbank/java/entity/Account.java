package com.consumerbank.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer accounId;
private Long accountNumber;
private double balance;
private Integer customerId;
public Integer getAccounId() {
	return accounId;
}
public void setAccounId(Integer accounId) {
	this.accounId = accounId;
}
public Long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(Long accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getAccounType() {
	return accounType;
}
public void setAccounType(String accounType) {
	this.accounType = accounType;
}
private String accounType;
@Override
public String toString() {
	return "Account [accounId=" + accounId + ", accountNumber=" + accountNumber + ", balance=" + balance
			+ ", customerId=" + customerId + ", accounType=" + accounType + "]";
}
}
