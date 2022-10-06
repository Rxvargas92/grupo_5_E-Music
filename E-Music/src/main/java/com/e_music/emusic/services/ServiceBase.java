package com.e_music.emusic.services;

import java.util.List;

public interface ServiceBase<E>{
    List<E> findAll() throws Exception;
    E findById(long id) throws Exception;
    E saveOne(E entity) throws Exception;
    E updateOne(E entity, long id) throws Exception;
    boolean deleteById(long id) throws Exception;
}