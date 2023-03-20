package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Entraineur;

@Repository
public interface EntraineurRepository extends JpaRepository<Entraineur, Long> {

}
