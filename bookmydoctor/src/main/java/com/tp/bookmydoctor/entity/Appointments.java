package com.tp.bookmydoctor.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "appointment_table")
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;
    private String appointmentDate;
    
    private String appointmentTime;
    
    private String status;
    
    @ManyToOne
    private User user;
    @ManyToOne
    private Doctor doctor;


}
