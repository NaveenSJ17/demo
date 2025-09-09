package com.tp.bookmydoctor.requestdto;

import java.util.List;

import com.tp.bookmydoctor.entity.Doctor;

import lombok.Data;

@Data
public class AdminRequestDto {

	private Integer id;

	private String email;

	private String password;
	private List<DoctorRequestDto>doctorRequestDtos;

}
