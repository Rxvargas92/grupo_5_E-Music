package com.e_music.emusic.repositories;


import com.e_music.emusic.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryBrand extends JpaRepository<Brand, Long> {
}