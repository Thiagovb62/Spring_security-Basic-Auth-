package com.example.spring_sec.Repository;

import com.example.spring_sec.model.UserModelSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository < UserModelSchema, Integer> {

    @Query("SELECT u FROM UserModelSchema u WHERE u.username = :username")
    UserModelSchema findByUsername(@Param ("username") String username);
}
