package com.tp.bookmydoctor.requestdto;

import java.util.List;

import com.tp.bookmydoctor.entity.Leave;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class DoctorRequestDto {
	
	 
	    private Integer doctorId;
	  
	    @NotBlank(message = "this field cannot be blank")
	    @Size(min = 3,max = 40)
	    private String doctorName;
	    @Column(length = 50)
	    @NotBlank(message = "this field cannot be blank")
	    private String speciality;
	    @Email
	    private String email;
	    @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
	    private String password;
	    private Double ratings;
	    
	    private Boolean working;
	    
	    private List<LeaveRequestDto> leaves;
	    

}
