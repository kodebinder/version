package com.javatechie.spring.procedure.api.dao;

import com.javatechie.spring.procedure.api.model.Ticket;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDao {

	private final EntityManager em;

	public TicketDao(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfo() {
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfoByCategory(String input) {
		return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("tcategory", input).getResultList();
	}
}
