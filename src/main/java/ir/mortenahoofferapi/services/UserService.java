package ir.mortenahoofferapi.services;

import ir.mortenahoofferapi.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository repository) {
        this.userRepository = repository;
    }

    public boolean UserExist(String username, String password) {
        return userRepository.existsByUsernameAndPassword(username, password);
    }

}
