package com.e_music.emusic.repositories;

import com.e_music.emusic.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends RepositoryBase<User, Long> {

}