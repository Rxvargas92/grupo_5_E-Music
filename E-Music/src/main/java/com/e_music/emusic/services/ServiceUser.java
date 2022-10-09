package com.e_music.emusic.services;

import com.e_music.emusic.entities.User;
import com.e_music.emusic.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceUser implements ServiceBase<User>{

    @Autowired
    private RepositoryUser repositoryUser;

    @Override
    @Transactional
    public List<User> findAll() throws Exception {
        try{
            List<User> users = repositoryUser.findAll();
            return users;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<User> findAllByActive() throws Exception {
        try{
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User findById(long id) throws Exception {
        try{
            Optional<User> opt = repositoryUser.findById(id);
            return opt.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User saveOne(User entity) throws Exception {
        try{
            User user = repositoryUser.save(entity);
            return user;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User updateOne(User entity, long id) throws Exception {
        try{
            Optional<User> opt = repositoryUser.findById(id);
            User user = opt.get();
            user = repositoryUser.save(entity);
            return user;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try{
            Optional<User> opt = repositoryUser.findById(id);
            if(!opt.isEmpty()){
                User user = opt.get();
                user.setActive(!user.isActive());
                repositoryUser.save(user);
            }
            else throw new Exception();

            return true;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}