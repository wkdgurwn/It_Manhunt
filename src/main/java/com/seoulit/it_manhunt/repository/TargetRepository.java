package com.seoulit.it_manhunt.repository;

import com.seoulit.it_manhunt.entity.Target;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetRepository extends JpaRepository<Target, Integer> {
}
