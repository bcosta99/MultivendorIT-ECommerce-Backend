package com.multivendorIT.ecommerce.backend.infrastructure.adapter;

import com.multivendorIT.ecommerce.backend.infrastructure.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity, Integer> {
}
