package com.selly.event_ticket_manager_backend.repository;

import com.selly.event_ticket_manager_backend.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Event findByEventName(String eventName);

    List<Event> findByCreatedById(Long userId);

    List<Event> findByEventDateAfter(LocalDateTime eventDate);
    List<Event> findByEventDateBefore(LocalDateTime eventDate);

    List<Event> findByLocation(String location);
}
