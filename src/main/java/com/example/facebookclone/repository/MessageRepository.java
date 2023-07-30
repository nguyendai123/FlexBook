package com.example.facebookclone.repository;
import com.example.facebookclone.model.Messages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Messages, Integer> {
}
