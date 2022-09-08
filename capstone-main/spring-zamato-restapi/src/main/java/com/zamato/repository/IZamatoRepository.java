package com.zamato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zamato.model.Zamato;
@Repository
public interface IZamatoRepository extends  JpaRepository<Zamato, Integer>{

}
