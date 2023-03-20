package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Pays;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Long> {

}
