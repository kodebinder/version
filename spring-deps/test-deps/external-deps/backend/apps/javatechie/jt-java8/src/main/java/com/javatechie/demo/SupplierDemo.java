package com.javatechie.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {


		List<String> list1 = Arrays.asList();

		System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewers"));
	}
}
