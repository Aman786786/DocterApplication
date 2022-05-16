package com.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.Entity.Docter;

public interface DocterRepository extends JpaRepository<Docter, Integer>  {

}
