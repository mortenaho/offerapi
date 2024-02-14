package ir.mortenahoofferapi.controllers;


import ir.mortenahoofferapi.dto.request.LoginRequest;
import ir.mortenahoofferapi.dto.response.GeneralResponse;
import ir.mortenahoofferapi.services.IUserService;
import ir.mortenahoofferapi.services.UserService;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    @ResponseBody
    public GeneralResponse<Null> Login(@RequestBody LoginRequest loginRequest) {
        GeneralResponse<Null> response = new GeneralResponse<Null>();
        if (userService.UserExist(loginRequest.getUsername(), loginRequest.getPassword())) {
            response.ResponseMessage = "login successfully";
            response.ResponseCode = 200;
        } else {
            response.ResponseMessage = "login failed";
            response.ResponseCode = 401;
        }
        return response;
    }
}
