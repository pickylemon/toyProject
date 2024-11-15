package com.woowangjwawang.toyProject.security.config;

import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtTokenProvider {
    private Environment env;
    private String secretKey = env.getProperty("JWT_SECRET");
    private long tokenValidTime = 30 * 60 * 1000L; //30분

    public String generateToken(Authentication authentication){
        //토큰 생성 로직
    }

    public boolean validateToken(String token){
        //토근 검증 로직
    }

    public Authentication getAuthentication(String token){
        // Authentication 추출 로직
    }

}
