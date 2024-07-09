package com.example.aontt_test.controller;


import com.example.aontt_test.dto.OrganizationDTO;
import com.example.aontt_test.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Класс-контроллер для управления операциями с организациями.
 */
@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;
    /**
     * Получение списка всех организаций.
     *
     * @return список организаций
     */
    @GetMapping
    public List<OrganizationDTO> getAllOrganizations(@RequestParam(required = false) String search) {
        if (search != null && !search.isEmpty()) {
            return organizationService.searchOrganizations(search);
        } else {
            return organizationService.getAllOrganizations();
        }
    }
    /**
     * Получение организации по идентификатору.
     *
     * @param id идентификатор организации
     * @return DTO организации с указанным идентификатором или null, если организация не найдена
     */
    @GetMapping("/{id}")
    public OrganizationDTO getOrganizationById(@PathVariable Long id) {
        return organizationService.getOrganizationById(id);
    }
}

