package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
