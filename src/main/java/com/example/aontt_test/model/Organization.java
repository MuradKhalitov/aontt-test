package com.example.aontt_test.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
/**
 * Модель организации.
 */
@Entity
@Getter
@Setter
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    private String shortName;

    @Column(nullable = false, unique = true)
    private String inn;

    @Column(nullable = false, unique = true)
    private String ogrn;

    private String postalAddress;
    private String legalAddress;

    private String ceoFullName;
    private LocalDate ceoBirthDate;
}

