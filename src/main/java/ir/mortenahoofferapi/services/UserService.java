package ir.mortenahoofferapi.services;

import ir.mortenahoofferapi.repositories.IUserRepository;

public class UserService {
    IUserRepository userRepository;
    UserService(IUserRepository userRepository){
        this.userRepository=userRepository;
    }
}
