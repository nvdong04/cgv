package com.onemount.cgv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomDTO {
    private Long id;
    private String name;
    private int numberSeat;
    private String projector;
    private CinemaDTO cinemaDTO;
    private String status;
    private TicketDTO ticketDTO;
}
