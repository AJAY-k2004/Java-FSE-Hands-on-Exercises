package com.cognizant.jwt_auth.controller;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    // ✅ Generate secure 256-bit key once (you can also move this to a config class or service)
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @RequestMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        // 🔐 Read "Authorization" header from Basic Auth
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            // Strip "Basic " and decode Base64
            String base64Credentials = authHeader.substring("Basic ".length());
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));

            
            final String[] values = credentials.split(":", 2);
            String username = values[0];
            String password = values[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                // ✅ Generate JWT Token
                String token = Jwts.builder()
                        .setSubject(username)
                        .setIssuedAt(new Date())
                        .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 10)) // 10 mins
                        .signWith(key)
                        .compact();

                return "{\"token\":\"" + token + "\"}";
            }
        }

        // ❌ If credentials invalid
        return "Invalid credentials.";
    }
}
