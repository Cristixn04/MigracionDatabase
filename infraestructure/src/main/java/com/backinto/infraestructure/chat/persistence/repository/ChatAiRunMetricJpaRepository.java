package com.backinto.infraestructure.chat.persistence.repository;

import com.backinto.infraestructure.chat.persistence.entity.ChatAiRunMetricJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChatAiRunMetricJpaRepository extends JpaRepository<ChatAiRunMetricJpaEntity, UUID> {
}
