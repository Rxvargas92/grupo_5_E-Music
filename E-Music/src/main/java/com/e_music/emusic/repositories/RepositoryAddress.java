package com.e_music.emusic.repositories;

import com.e_music.emusic.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAddress extends JpaRepository<Address, Long> {

}