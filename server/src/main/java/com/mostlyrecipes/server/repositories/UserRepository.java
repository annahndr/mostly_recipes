package com.mostlyrecipes.server.repositories;

import com.mostlyrecipes.server.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
