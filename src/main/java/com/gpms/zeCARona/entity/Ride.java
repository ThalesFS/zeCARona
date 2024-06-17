package com.gpms.zeCARona.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity @Table(name = "Caronas")
public class Ride {

    @Getter @Setter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ride;

    @Getter @Setter
    private Long id_driver; //id

    @Getter @Setter
    private Date begin_ride_time;

    @Getter @Setter
    private Date date;

    @Getter @Setter
    private Date end_ride_time;

    @Getter @Setter
    private String status;

    @Getter @Setter
    private String departure;

    @Getter @Setter
    private String destination;

    @Getter @Setter
    private int qnt_passengers;

}
