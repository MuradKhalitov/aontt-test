package com.example.aontt_test.service;

import com.example.aontt_test.dto.OrganizationDTO;
import com.example.aontt_test.model.Organization;
import com.example.aontt_test.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
/**
 * Сервис для работы с организациями.
 */
@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;
    /**
     * Получить список всех организаций в виде DTO.
     *
     * @return список DTO всех организаций
     */
    public List<OrganizationDTO> getAllOrganizations() {
        return organizationRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    /**
     * Поиск организаций по полному названию (игнорируя регистр).
     *
     * @param search строка для поиска
     * @return список DTO организаций, удовлетворяющих критериям поиска
     */
    public List<OrganizationDTO> searchOrganizations(String search) {
        return organizationRepository.findByFullNameContainingIgnoreCase(search).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    /**
     * Получить организацию по её идентификатору.
     *
     * @param id идентификатор организации
     * @return DTO организации, если она найдена; в противном случае null
     */
    public OrganizationDTO getOrganizationById(Long id) {
        return organizationRepository.findById(id)
                .map(this::convertToDTO)
                .orElse(null);
    }
    /**
     * Преобразовать сущность Organization в DTO.
     *
     * @param organization сущность Organization для преобразования
     * @return DTO организации
     */
    private OrganizationDTO convertToDTO(Organization organization) {
        OrganizationDTO dto = new OrganizationDTO();
        dto.setId(organization.getId());
        dto.setFullName(organization.getFullName());
        dto.setShortName(organization.getShortName());
        dto.setInn(organization.getInn());
        dto.setOgrn(organization.getOgrn());
        dto.setPostalAddress(organization.getPostalAddress());
        dto.setLegalAddress(organization.getLegalAddress());
        dto.setCeoFullName(organization.getCeoFullName());
        dto.setCeoBirthDate(organization.getCeoBirthDate());
        return dto;
    }
}

