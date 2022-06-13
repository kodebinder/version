package com.company.b.simple.design.business.customer;

import java.util.List;

import com.company.b.simple.design.business.exception.DifferentCurrenciesException;
import com.company.b.simple.design.model.customer.Amount;
import com.company.b.simple.design.model.customer.Product;

public interface CustomerBO {

	Amount getCustomerProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}