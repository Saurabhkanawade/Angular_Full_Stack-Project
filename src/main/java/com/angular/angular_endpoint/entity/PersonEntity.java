package com.angular.angular_endpoint.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    @NotBlank(message = "Name is Mandatory")
    private String fullName;
    @NotBlank(message = "gmail is Mandatory")
    private String gmail;
    @NotBlank(message = "phone number is Mandatory")
    private Long phone;
    @NotBlank(message = "dob is Mandatory")
    private Date dob;
    @NotBlank(message = "gender is Mandatory")
    private String gender;
    @NotBlank(message = "education is Mandatory")
    private String Education;

}
