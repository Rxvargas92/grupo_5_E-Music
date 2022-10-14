package com.e_music.emusic.services;

import com.e_music.emusic.entities.Category;
import com.e_music.emusic.entities.User;
import com.e_music.emusic.repositories.RepositoryBase;
import com.e_music.emusic.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceUserImpl extends ServiceBaseImpl<User, Long> implements ServiceUser{

    public ServiceUserImpl(RepositoryBase<User, Long> repositoryBase){ super(repositoryBase); }
}