package com.bharath.springdata.transactionmanagement;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdata.transactionmanagement.services.BankAccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransactionmanagementApplicationTests {

	@Autowired
	BankAccountService bankAccountService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testTransfer() {
		bankAccountService.transfer(500);
	}

}
