package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Tiers;

@Repository
public interface TiersRepository extends JpaRepository<Tiers, Long> {

}
