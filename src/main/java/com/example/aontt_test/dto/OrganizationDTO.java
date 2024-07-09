package com.example.aontt_test.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * DTO (Data Transfer Object) для организации.
 */
@Getter
@Setter
public class OrganizationDTO {
    private Long id;
    private String fullName;
    private String shortName;
    private String inn;
    private String ogrn;
    private String postalAddress;
    private String legalAddress;
    private String ceoFullName;
    private LocalDate ceoBirthDate;
    private List<BranchDTO> branches;
}

