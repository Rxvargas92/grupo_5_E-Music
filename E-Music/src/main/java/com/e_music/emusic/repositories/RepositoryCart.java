package com.e_music.emusic.repositories;


import com.e_music.emusic.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCart extends JpaRepository<Cart, Long> {

}