package com.e_music.emusic.services;

import com.e_music.emusic.entities.Brand;
import com.e_music.emusic.entities.Category;
import com.e_music.emusic.repositories.RepositoryBrand;
import com.e_music.emusic.repositories.RepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceBrand implements ServiceBase<Brand> {
    @Autowired
    private RepositoryBrand repository;

    @Override
    @Transactional
    public List<Brand> findAll() throws Exception {
        try {
            List<Brand> brands = this.repository.findAll();
            return brands;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Brand findById(long id) throws Exception {
        try {
            Optional<Brand> opt = this.repository.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Brand saveOne(Brand entity) throws Exception {
        try {
            Brand brand = this.repository.save(entity);
            return brand;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Brand updateOne(Brand entity, long id) throws Exception {
        try {
            Optional<Brand> opt = this.repository.findById(id);
            Brand brand = opt.get();
            brand = this.repository.save(entity);
            return brand;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Brand> opt = this.repository.findById(id);
            if (!opt.isEmpty()) {
                Brand brand = opt.get();
                brand.setActive(!brand.isActive());
                this.repository.save(brand);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}