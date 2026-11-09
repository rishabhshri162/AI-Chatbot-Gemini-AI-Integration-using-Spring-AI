
package com.rishabh.aichatbot.controller;

import org.springframework.web.bind.annotation.*;

import com.rishabh.aichatbot.dto.AuthRequest;
import com.rishabh.aichatbot.entity.AppUser;
import com.rishabh.aichatbot.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public String signup(@RequestBody AuthRequest request) {

        AppUser user = new AppUser();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return authService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {

        return authService.login(
                request.getEmail(),
                request.getPassword()
        );
    }
}
