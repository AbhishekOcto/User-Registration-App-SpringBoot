package com.bridgelabz.userRegistration.Repository;

import com.bridgelabz.userRegistration.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
