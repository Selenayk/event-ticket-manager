package com.selly.event_ticket_manager_backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User seller;

    @ManyToOne
    private User buyer;

    @NotNull
    private String sellerEmail;

    @NotNull
    private String buyerEmail;

    @Positive
    private int quantity;

    @ManyToOne
    private Event event;
}
