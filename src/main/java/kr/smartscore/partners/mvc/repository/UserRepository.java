package kr.smartscore.partners.mvc.repository;

import kr.smartscore.partners.mvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}