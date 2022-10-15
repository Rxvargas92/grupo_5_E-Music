package com.e_music.emusic.services;

import com.e_music.emusic.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface ServiceBase<E extends Base, ID extends Serializable>{
    List<E> findAll() throws Exception;

    /*List<E> findAllByActive( ) throws Exception;*/
    E findById(ID id) throws Exception;
    E saveOne(E entity) throws Exception;
    E updateOne(E entity, ID id) throws Exception;
    boolean deleteById(ID id) throws Exception;
}