package com.backinto.infraestructure.chat.persistence.repository;

import com.backinto.infraestructure.chat.persistence.entity.ChatAiRunJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChatAiRunJpaRepository extends JpaRepository<ChatAiRunJpaEntity, UUID> {
}
