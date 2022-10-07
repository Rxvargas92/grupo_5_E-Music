package com.e_music.emusic.services;

import com.e_music.emusic.entities.Cart;
import com.e_music.emusic.repositories.RepositoryCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCart implements ServiceBase<Cart>{
    @Autowired
    private RepositoryCart repository;

    @Override
    @Transactional
    public List<Cart> findAll() throws Exception {
        try {
            List<Cart> entities = this.repository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cart findById(long id) throws Exception {
        try {
            Optional<Cart> opt = this.repository.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cart saveOne(Cart entity) throws Exception {
        try {
            Cart cart = this.repository.save(entity);
            return cart;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cart updateOne(Cart entity, long id) throws Exception {
        try {
            Optional<Cart> opt = this.repository.findById(id);
            Cart cart = opt.get();
            cart = this.repository.save(entity);
            return cart;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Cart> opt = this.repository.findById(id);
            if (!opt.isEmpty()) {
                Cart cart = opt.get();
                cart.setActive(!cart.isActive());
                this.repository.save(cart);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}