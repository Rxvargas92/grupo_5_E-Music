package com.e_music.emusic.services;

import com.e_music.emusic.entities.Address;
import com.e_music.emusic.entities.User;
import com.e_music.emusic.repositories.RepositoryAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceAddress implements ServiceBase<Address>{

    @Autowired
    private RepositoryAddress repositoryAddress;

    @Override
    @Transactional
    public List<Address> findAll() throws Exception {
        try{
            List<Address> addresses = repositoryAddress.findAll();
            return addresses;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<Address> findAllByActive() throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Address findById(long id) throws Exception {
        try{
            Optional<Address> opt = repositoryAddress.findById(id);
            return opt.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Address saveOne(Address entity) throws Exception {
        try{
            Address address = repositoryAddress.save(entity);
            return address;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Address updateOne(Address entity, long id) throws Exception {
        try{
            Optional<Address> opt = repositoryAddress.findById(id);
            Address address = opt.get();
            address = repositoryAddress.save(entity);
            return address;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try{
            Optional<Address> opt = repositoryAddress.findById(id);
            if(!opt.isEmpty()){
                Address address = opt.get();
                address.setActive(!address.isActive());
                repositoryAddress.save(address);
            }
            else throw new Exception();

            return true;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}