package com.example.proje.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Employee_TBL")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    @NotNull(message = "Must be not blank")
    @Size(min =3)
    private String name;
    @NotBlank(message = "Must be not blank")
    private String surname;
    @NotBlank(message = "Must be not blank")
    private String company;
    @Email(message = "Email should be valid")
    private String email;
    private String phone;

}