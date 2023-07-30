package com.example.facebookclone.repository;
import com.example.facebookclone.model.Friends;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<Friends, Integer> {
}
