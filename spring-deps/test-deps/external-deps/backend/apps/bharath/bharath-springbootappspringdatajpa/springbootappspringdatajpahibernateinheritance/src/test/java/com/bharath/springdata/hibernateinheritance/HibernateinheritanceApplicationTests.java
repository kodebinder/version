package com.bharath.springdata.hibernateinheritance;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdata.hibernateinheritance.entities.Check;
import com.bharath.springdata.hibernateinheritance.entities.CreditCard;
import com.bharath.springdata.hibernateinheritance.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void create_1_Payment() {
		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");
		repository.save(cc);
	}

	@Test
	public void create_2_CheckPayment() {
		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setChecknumber("1234567890");
		repository.save(ch);
	}

}
