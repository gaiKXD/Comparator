package com.agaik.comparator.repository;


import com.agaik.comparator.model.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TankRepository extends JpaRepository<Tank, Integer> {

    List<Tank> findByName(String name);

    @Query(value = "SELECT b FROM Tank b WHERE b.id = ?1" )
    List<Tank> findTankById(int id);

}
