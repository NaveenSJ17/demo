package com.tp.bookmydoctor.responsedto;

import java.util.Date;

import com.tp.bookmydoctor.entity.Doctor;
import com.tp.bookmydoctor.entity.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
public class AppointmentResponseDto {


	private Integer appointmentId;
	private String appointmentDate;

	private String appointmentTime;

	private String status;


	private UserResponseDto userDto;

	private DoctorResponseDto doctorDto;



}
