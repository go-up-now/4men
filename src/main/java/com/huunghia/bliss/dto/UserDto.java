package com.huunghia.bliss.dto;

import com.huunghia.bliss.entity.Role;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    String username;
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
}
