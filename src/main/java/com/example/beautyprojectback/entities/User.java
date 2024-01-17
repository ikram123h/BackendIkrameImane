package com.example.beautyprojectback.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column (unique = true)
    private String username;
    private String password;
    private Boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "User Role",joinColumns = @JoinColumn(name = "User Id"),
            inverseJoinColumns = @JoinColumn(name = "Role Id"))
    private List<Role> roles ;
}
