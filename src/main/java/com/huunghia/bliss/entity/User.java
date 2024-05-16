package com.huunghia.bliss.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fullname;

    @Column(unique = true)
    String username;
    String password;
    String gender;
    String email;
    String phone;
    String address;
    LocalDate birthday;
    String img;
    String state;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    Role role = new Role();

    @OneToMany(mappedBy = "user")
    Set<Order> orders;


}
