package com.multivendorIT.ecommerce.backend.infrastructure.jwt;

import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Constants {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";
    public static final String SUPER_SECRET_KEY = "FDFasdasdVASDAb321b4321vASDasvdasv32VV213vDasdasdGHTVQW1231v2v3123vc12Vv123";
    public static final long TOKEN_EXPIRATION_TIME = 1500000; // 15 Minutos
    public static Key getSignedKey(String secretKey){
        byte [] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
