package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Sendmsg;

public interface SendmsgRepo extends JpaRepository<Sendmsg,Integer>{

}
