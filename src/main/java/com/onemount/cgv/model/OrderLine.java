package com.onemount.cgv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_order_line")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Ticket ticket;

    @Column(name = "seat_no")
    private int seatNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
}
