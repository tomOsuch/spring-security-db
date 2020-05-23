package pl.tomaszosuch.springsecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomaszosuch.springsecuritydb.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRole(String role);
}
