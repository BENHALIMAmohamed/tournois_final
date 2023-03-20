package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

}
