package com.e_music.emusic.repositories;


import com.e_music.emusic.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategory extends JpaRepository<Category, Long> {
}
