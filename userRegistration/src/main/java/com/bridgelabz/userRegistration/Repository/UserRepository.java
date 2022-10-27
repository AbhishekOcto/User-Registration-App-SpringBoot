package com.bridgelabz.userRegistration.Repository;

import com.bridgelabz.userRegistration.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    void delete(Optional<User> user);
}
