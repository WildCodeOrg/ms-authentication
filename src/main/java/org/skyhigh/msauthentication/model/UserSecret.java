package org.skyhigh.msauthentication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_secret")
public class UserSecret {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "u_login", nullable = false, length = 20)
    private String login;

    @Column(name = "u_pass", nullable = false, length = 120)
    private String password;
}
