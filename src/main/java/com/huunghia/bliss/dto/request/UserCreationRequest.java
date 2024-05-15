package com.huunghia.bliss.dto.request;

import com.huunghia.bliss.entity.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 8, message = "Username must be at least 8 characters")
    String username;

    @Size(min = 8, message = "Password must be at least 8 characters")
    String password;
    String email;
    String phone;
    String address;
    String fullname;

    @Column(unique = true)
    String gender;
    LocalDate birthday;
    String img;
    String state;
    Role role;

    @Column(name = "created_at")
    LocalDateTime createdAt;
}
