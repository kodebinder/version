package com.company.controller;

import com.company.entities.Ticket;
import com.company.service.TicketBookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

	private final TicketBookingService ticketBookingService;

	public TicketBookingController(TicketBookingService ticketBookingService) {
		this.ticketBookingService = ticketBookingService;
	}

	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId){
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId){
		ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value="/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail){
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
}
