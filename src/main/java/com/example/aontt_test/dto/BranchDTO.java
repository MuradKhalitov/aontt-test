package com.example.aontt_test.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * DTO (Data Transfer Object) для филиала организации.
 */
@Getter
@Setter
public class BranchDTO {
    private Long id;
    private String branchName;
    private String postalAddress;
    private String ceoFullName;
    private LocalDate ceoBirthDate;
}
