package com.agaik.comparator.repository;


import com.agaik.comparator.model.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TankRepository extends JpaRepository<Tank, Integer> {

    Tank findByName(String name);
}
