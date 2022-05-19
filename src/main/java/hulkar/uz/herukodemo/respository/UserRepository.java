package hulkar.uz.herukodemo.respository;

import hulkar.uz.herukodemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}