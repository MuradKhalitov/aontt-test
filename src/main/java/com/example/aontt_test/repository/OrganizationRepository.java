package com.example.aontt_test.repository;

import com.example.aontt_test.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * Репозиторий для работы с сущностями организаций в базе данных.
 */
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    /**
     * Найти организации, у которых полное название содержит указанную строку
     * (без учета регистра).
     *
     * @param search строка для поиска в полном названии организации
     * @return список организаций, удовлетворяющих критериям поиска
     */
    List<Organization> findByFullNameContainingIgnoreCase(String search);
}
