package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Journee;

@Repository
public interface JourneeRepository extends JpaRepository<Journee, Long> {

}
