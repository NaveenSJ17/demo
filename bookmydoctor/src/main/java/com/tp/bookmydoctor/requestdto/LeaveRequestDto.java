package com.tp.bookmydoctor.requestdto;

import java.time.LocalDate;
import java.util.List;

import com.tp.bookmydoctor.entity.Leave;
import com.tp.bookmydoctor.responsedto.DoctorResponseDto;

import lombok.Data;

@Data
public class LeaveRequestDto {

    private LocalDate startDate;

    private LocalDate endDate;

    private String reason;

//    private LeaveStatus status = LeaveStatus.PENDING;

    private DoctorRequestDto doctor;
    
  

}
