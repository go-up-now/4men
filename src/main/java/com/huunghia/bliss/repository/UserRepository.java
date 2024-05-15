package com.huunghia.bliss.repository;

import com.huunghia.bliss.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String userName);
}
