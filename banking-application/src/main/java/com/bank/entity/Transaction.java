package com.bank.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	private long id;
	private double creditAmount;
	private double debitAmount;
	private Date date;

}
