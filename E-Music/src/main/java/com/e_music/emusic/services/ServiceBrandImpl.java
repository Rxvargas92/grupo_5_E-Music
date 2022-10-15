package com.e_music.emusic.services;

import com.e_music.emusic.entities.Brand;
import com.e_music.emusic.repositories.RepositoryBase;
import org.springframework.stereotype.Service;

@Service
public class ServiceBrandImpl extends ServiceBaseImpl<Brand, Long> implements ServiceBrand {

    public ServiceBrandImpl(RepositoryBase<Brand, Long> repositoryBase){ super(repositoryBase); }
}