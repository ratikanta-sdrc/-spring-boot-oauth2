package org.sdrc.oauth2.repository;

import java.util.Optional;

import org.sdrc.oauth2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
}
