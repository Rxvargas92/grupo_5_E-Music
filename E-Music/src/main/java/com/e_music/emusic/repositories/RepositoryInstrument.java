package com.e_music.emusic.repositories;


import com.e_music.emusic.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryInstrument extends JpaRepository< Instrument, Long> {

    @Query ( value = "SELECT * FROM instrument WHERE instrument.active = true", nativeQuery = true )
    List< Instrument > findAllByActive( );

}
