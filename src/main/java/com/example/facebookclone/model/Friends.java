package com.example.facebookclone.model;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "friends")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id1")
    private Users user1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id2")
    private Users user2;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private FriendStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_user_id")
    private Users actionUser;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Friends(Users user1, Users user2, FriendStatus status, Users actionUser, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.user1 = user1;
        this.user2 = user2;
        this.status = status;
        this.actionUser = actionUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
