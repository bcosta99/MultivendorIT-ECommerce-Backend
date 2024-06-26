package com.multivendorIT.ecommerce.backend.infrastructure.adapter;

import com.multivendorIT.ecommerce.backend.domain.model.Category;
import com.multivendorIT.ecommerce.backend.domain.port.ICategoryRepository;
import com.multivendorIT.ecommerce.backend.infrastructure.mapper.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CategoryCrudRepositoryImpl implements ICategoryRepository {
    private final ICategoryCrudRepository iCategoryCrudRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public Category save(Category category) {
        return categoryMapper.toCategory(iCategoryCrudRepository.save(categoryMapper.toCategoryEntity(category)));
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryMapper.toCategoryList(iCategoryCrudRepository.findAll());
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.toCategory(iCategoryCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Categoría con id: " + id + " no existe")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Categoría con id: " + id + " no existe")
        );
        iCategoryCrudRepository.deleteById(id);
    }
}
