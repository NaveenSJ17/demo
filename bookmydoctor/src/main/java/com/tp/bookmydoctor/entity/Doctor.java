package com.tp.bookmydoctor.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "doctor_table")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	@Column(length = 50)

	private String doctorName;
	@Column(length = 50)

	private String speciality;
	@Email
	@Column(nullable = false)
	private String email;

	private String password;
	private Double ratings;

	private Boolean working;



	@OneToMany(mappedBy = "doctor")
	private List<Appointments> appointmentsList;

	@OneToMany(mappedBy = "doctor")
	private List<Leave> leaves;

}

