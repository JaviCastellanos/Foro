package com.ejemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejemplo.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}