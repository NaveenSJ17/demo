package com.tp.bookmydoctor.requestdto;

import java.util.Date;

import com.tp.bookmydoctor.entity.Doctor;
import com.tp.bookmydoctor.entity.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
public class AppoinmentRequestDto {
	
	 
	    private Integer appointmentId;
	    private String appointmentDate;
	    
	    private String appointmentTime;
	    
	    private String status;
	    
	   
	    private User user;
	
	    private Doctor doctor;



}
