package ir.mortenahoofferapi.repositories;

import ir.mortenahoofferapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
