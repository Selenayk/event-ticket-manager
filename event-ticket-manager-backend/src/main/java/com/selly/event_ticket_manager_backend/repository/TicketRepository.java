package com.selly.event_ticket_manager_backend.repository;

import com.selly.event_ticket_manager_backend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByEventId(Long eventId);

    List<Ticket> findByBuyerEmail(String buyerEmail);
}
