package ir.mortenahoofferapi.repositories;

import ir.mortenahoofferapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
     boolean existsByUsernameAndPassword(String username, String password);
}
