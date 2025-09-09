package com.tp.bookmydoctor.responsedto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DoctorResponseDto {


	private String doctorName;


	private String speciality;

	private String email;


	private Double ratings;
	

}
