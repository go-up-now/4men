package com.huunghia.bliss.dto.request;

import com.huunghia.bliss.entity.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.java.Log;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdationRequest {
    String password;
    String email;
    String phone;
    String address;
    String fullname;
    String gender;
    LocalDate birthday;
    String img;
    String state;
    Role role;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;
}
