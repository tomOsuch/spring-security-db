package pl.tomaszosuch.springsecuritydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomaszosuch.springsecuritydb.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
