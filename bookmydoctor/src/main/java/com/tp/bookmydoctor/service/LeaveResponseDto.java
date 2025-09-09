package com.tp.bookmydoctor.service;

import java.time.LocalDate;

import com.tp.bookmydoctor.exception.LeaveStatus;
import com.tp.bookmydoctor.responsedto.DoctorResponseDto;

import lombok.Data;

@Data
public class LeaveResponseDto {
	
	 private Integer id;

	    private LocalDate startDate;

	    private LocalDate endDate;

	    private String reason;

	    private LeaveStatus status = LeaveStatus.PENDING;

	    private DoctorResponseDto doctor;
	}


