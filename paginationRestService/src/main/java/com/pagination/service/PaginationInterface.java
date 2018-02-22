package com.pagination.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.pagination.exceptions.PaginationFault;
import com.pagination.numbers.Numbers;

public interface PaginationInterface {

	@GET
	@Path("/thosebooks/{bookId}/")
	@Produces("application/xml")
	Numbers getNumbers(Long id) throws PaginationFault;
}
