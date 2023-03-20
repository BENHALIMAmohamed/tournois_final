package com.iset.tournois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iset.tournois.entities.But;

@Repository
public interface ButRepository extends JpaRepository<But, Long> {

}
