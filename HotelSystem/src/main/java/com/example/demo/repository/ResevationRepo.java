package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Resevation;

public interface ResevationRepo extends JpaRepository<Resevation,Integer>{

}
