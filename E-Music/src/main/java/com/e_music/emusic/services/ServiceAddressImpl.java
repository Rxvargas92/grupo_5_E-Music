package com.e_music.emusic.services;

import com.e_music.emusic.entities.Address;
import com.e_music.emusic.repositories.RepositoryBase;
import org.springframework.stereotype.Service;

@Service
public class ServiceAddressImpl extends ServiceBaseImpl<Address, Long> implements ServiceAddress{

    public ServiceAddressImpl(RepositoryBase<Address, Long> repositoryBase) { super(repositoryBase); }
}