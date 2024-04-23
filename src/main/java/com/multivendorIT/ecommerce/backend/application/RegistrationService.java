package com.multivendorIT.ecommerce.backend.application;

import com.multivendorIT.ecommerce.backend.domain.model.User;
import com.multivendorIT.ecommerce.backend.domain.port.IUserRepository;

public class RegistrationService {
    private final IUserRepository iUserRepository;

    public RegistrationService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }

    public User register(User user){
        return iUserRepository.save(user);
    }
}
