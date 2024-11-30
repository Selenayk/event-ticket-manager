package com.selly.event_ticket_manager_backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String eventName;

    @NotNull
    private String location;

    @Future
    private LocalDateTime eventDate;

    @Positive
    private long totalTickets;

    @PositiveOrZero
    private long availableTickets;

    @Positive
    private int price;

    @ManyToOne
    @JoinColumn(name = "created_by_id", nullable = false)
    private User createdBy;

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;
}
