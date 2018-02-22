package com.pagination.service;

import java.util.Arrays;

import com.pagination.exceptions.PaginationFault;
import com.pagination.numbers.Numbers;

public class PaginationService implements PaginationInterface{

	public Numbers getNumbers(Long id) throws PaginationFault {
		Numbers numbers = new Numbers();
		numbers.getNumber().addAll(Arrays.asList(new String[]{"1","2","3"}));
		return numbers;
	}
	
}