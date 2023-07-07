package com.company.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company.dao.BankDao;
import com.company.dao.exception.InsufficientAccountBalanceException;
import com.company.dao.mapper.AccountRowMapper;
import com.company.model.Account;

@Repository
public class BankDaoImpl implements BankDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void withdraw(Account fromAccount, Account toAccount, Double amount)
			throws InsufficientAccountBalanceException {
		Account accountFromDb = getAccountFromDb(fromAccount.getAccountNumber());

		Double accountBalance = accountFromDb.getAccountBalance() - amount;
		if (accountFromDb.getAccountBalance() >= amount) {
			String SQL = "UPDATE icici_bank set account_balance=? WHERE account_no=?";
			int update = getJdbcTemplate().update(SQL, accountBalance, fromAccount.getAccountNumber());
			if (update > 0) {
				System.out.println("Amount Rs:" + amount + " is tranferred from Account No:"
						+ fromAccount.getAccountNumber() + " to Account No:" + toAccount.getAccountNumber());
			}
		} else {
			throw new InsufficientAccountBalanceException("Insufficient account balance");
		}
	}

	public void deposit(Account fromAccount, Account toAccount, Double amount) {
		Account accountFromDb = getAccountFromDb(toAccount.getAccountNumber());
		Double accountBalance = accountFromDb.getAccountBalance() + amount;
		String SQL = "UPDATE icici_bank set account_balance=? WHERE account_no=?";
		int update = getJdbcTemplate().update(SQL, accountBalance, toAccount.getAccountNumber());
		if (update > 0) {
			System.out.println("Amount Rs:" + amount + " is deposited in Account No:" + toAccount.getAccountNumber());
		}
	}

	private Account getAccountFromDb(Long accountNumber) {
		String SQL = "SELECT * FROM icici_bank WHERE account_no = ?";
		Account account = getJdbcTemplate().queryForObject(SQL, new AccountRowMapper(), accountNumber);
		return account;
	}

}
