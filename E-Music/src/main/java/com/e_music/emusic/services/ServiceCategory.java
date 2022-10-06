package com.e_music.emusic.services;

import com.e_music.emusic.entities.Category;
import com.e_music.emusic.repositories.RepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCategory implements ServiceBase<Category> {
    @Autowired
    private RepositoryCategory repository;

    @Override
    @Transactional
    public List<Category> findAll() throws Exception {
        try {
            List<Category> categories = this.repository.findAll();
            return categories;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Category findById(long id) throws Exception {
        try {
            Optional<Category> opt = this.repository.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Category saveOne(Category entity) throws Exception {
        try {
            Category category = this.repository.save(entity);
            return category;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Category updateOne(Category entity, long id) throws Exception {
        try {
            Optional<Category> opt = this.repository.findById(id);
            Category category = opt.get();
            category = this.repository.save(entity);
            return category;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Category> opt = this.repository.findById(id);
            if (!opt.isEmpty()) {
                Category category = opt.get();
                category.setActive(!category.isActive());
                this.repository.save(category);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}