package com.fuji.employee_adapter;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "employee")
@Entity
@Builder( toBuilder = true )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long empId;
    private String firstName;
    private String lastName;
    private String martialStatus;
    private String mobile;
    private String address;
    private String citizenship;
    private String nationality;
    private LocalDate dateOfBirth;
    private String gender;
    private String email;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

}