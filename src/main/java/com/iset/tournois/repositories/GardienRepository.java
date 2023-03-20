package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Gardien;

@Repository
public interface GardienRepository extends JpaRepository<Gardien, Long> {

}
