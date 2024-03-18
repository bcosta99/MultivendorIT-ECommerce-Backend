package com.multivendorIT.ecommerce.backend.infrastructure.adapter;

import com.multivendorIT.ecommerce.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {
}
